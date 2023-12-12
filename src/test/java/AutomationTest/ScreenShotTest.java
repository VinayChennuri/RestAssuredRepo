package AutomationTest;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShotTest {
public static WebDriver driver;
	
	@Test
	public void sc() throws Throwable
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	
	// Screenshot Test
	TakesScreenshot ts = (TakesScreenshot) driver;
	File ab = ts.getScreenshotAs(OutputType.FILE);
	Files.copy(ab, new File("C:\\Users\\vc21352\\eclipse-workspace\\SeleniumPrograms\\ScreenShots\\sc1.png"));
	}
}
