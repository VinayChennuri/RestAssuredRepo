package DynamicData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomNewUser {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		 Faker faker = new Faker();
		 String randomName = faker.name().fullName();
         String randomLastName = faker.name().lastName();
         String randomEmail = faker.internet().emailAddress();


		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("New User Register Here")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys(randomLastName);
//		driver.findElement(By.id("password")).sendKeys(randomLastName);
//		driver.findElement(By.id("re_password")).sendKeys(randomLastName);
//		driver.findElement(By.id("full_name")).sendKeys(randomName);
//		driver.findElement(By.id("email_add")).sendKeys(randomEmail);
//		

	}

}
