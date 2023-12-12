package AutomationTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {	
public static WebDriver driver;
	 
	@Test
	public void login( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Galactic Silver, 8GB RAM, 128GB Storage)']")).click();		
	}
}
