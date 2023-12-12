package AutomationTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsTest {
public static WebDriver driver;
	@Test
	public static void acceptTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("cusid")).sendKeys("12345");	 
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().accept();
	driver.close();
	}
	
	@Test
	public static void dismissTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("cusid")).sendKeys("12345");	 
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().dismiss();
	driver.close();
	}
	
	@Test
	public static void getTextTests() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		String ab = driver.switchTo().alert().getText();
		System.out.println(ab);
		driver.close();
	} 
}