package AdactinPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdactinTest {
	public static WebDriver driver;


	public void adactinlogin()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vinaychennuri1");
		driver.findElement(By.name("password")).sendKeys("8187826150");
		driver.findElement(By.cssSelector("#login")).click();
	}

	public void searchHotel() 
	
	{
		Select loc = new Select(driver.findElement(By.xpath("//select[@id='location']"))); // Basic Xpath
		loc.selectByIndex(2);

		Select hotel = new Select(driver.findElement(By.xpath("//select[contains(@id,'hotels')]"))); // Xpath Contains
		hotel.selectByVisibleText("Hotel Sunshine");

		Select RM = new Select(driver.findElement(By.xpath("//select[@id='room_type' or @name='room_ty']"))); // Xpath or
																												
		RM.selectByValue("Double");

		Select NOM = new Select(driver.findElement(By.xpath("//select[@id='room_nos' and @name='room_nos']"))); // Xpath and
																												
		NOM.selectByIndex(2);

		driver.findElement(By.xpath("(//input[starts-with(@id,'dat')])[1]")).clear();
		driver.findElement(By.xpath("(//input[starts-with(@id,'dat')])[1]")).sendKeys("10/06/2023"); // Xpath Starts-with
		
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("15/06/2023");
		
		Select APR = new Select(driver.findElement(By.id("adult_room")));
		APR.selectByIndex(3);
		
		Select CPR = new Select(driver.findElement(By.id("child_room")));
		CPR.selectByIndex(2);
	}
	
	public void selectHotel()
	
	{
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}
	
	public void bookHotel()
	
	{
		driver.findElement(By.id("first_name")).sendKeys("Vinay");
		driver.findElement(By.id("last_name")).sendKeys("Kumar");
		
		Select card = new Select(driver.findElement(By.id("cc_type")));
		card.selectByIndex(2);
		
		Select ED = new Select(driver.findElement(By.id("cc_exp_month")));
		ED.selectByIndex(2);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		
	}
	
	public void bookItinerary()
	{
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		driver.findElement(By.xpath("(//input[@name='ids[]'])[1]")).click();
		
	}
}
