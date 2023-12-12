package AutomationTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitsPrograms {
public static WebDriver driver;
	@Test
	public void implicitWaitTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vinaychennuri1");
		driver.findElement(By.name("password")).sendKeys("8187826150");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // implicit wait will wait for a particular amount of Time.
		driver.findElement(By.linkText("Booked Itinerary")).click();
		
		//Explicit wait or WebDriver wait will wait for particular condition 
		WebDriverWait wt = new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Change Password")));
	}

}
