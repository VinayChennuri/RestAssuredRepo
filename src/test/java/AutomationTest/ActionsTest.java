package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
public static WebDriver driver;
	
	@Test
	public void doubleClickTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vinaychennuri1");
		driver.findElement(By.name("password")).sendKeys("8187826150");
		Actions ac = new Actions(driver);
		WebElement lb = driver.findElement(By.name("password"));
		ac.doubleClick(lb).build().perform();                         // Double Click
		driver.findElement(By.id("login")).click();
		WebElement lg = driver.findElement(By.linkText("Logout"));
        ac.moveToElement(lg).build().perform();                       // Move To Element
        Thread.sleep(3000);
        WebElement loc = driver.findElement(By.id("location"));
        ac.contextClick(loc).build().perform();                       // Right Click
        driver.findElement(By.id("hotels")).click();
        Thread.sleep(3000);
        WebElement bi = driver.findElement(By.linkText("Booked Itinerary"));
        WebElement cp = driver.findElement(By.linkText("Change Password"));
        ac.dragAndDrop(bi, cp).build().perform();                     // Drag and Drop
		
	}
	
	

}
