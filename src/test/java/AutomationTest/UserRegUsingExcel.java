package AutomationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegUsingExcel {
	
	@Test
	public void data() throws Exception
	{
		Faker faker = new Faker();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.3.106:8890/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign up")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Create path	
		File a = new File ("‪C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		System.out.println(a);
        FileInputStream b = new FileInputStream(a);
        XSSFWorkbook c = new XSSFWorkbook(b); 
        XSSFSheet d = c.getSheetAt(0);
        
        //Excel Data
        double EmpID       = d.getRow(1).getCell(1).getNumericCellValue();
        String EmpName     = d.getRow(1).getCell(2).getStringCellValue();
        String Email       = d.getRow(1).getCell(3).getStringCellValue();    
        String PhoneNumber = d.getRow(1).getCell(4).getStringCellValue();
		
		// Employee ID
        driver.findElement(By.id("empId")).sendKeys(Double.toString(EmpID));
        
		// Employee Full Name
		driver.findElement(By.id("empName")).sendKeys(EmpName);
		
		//Email 
		driver.findElement(By.id("emailId")).sendKeys(Email);
		
		//Password
		driver.findElement(By.id("password")).sendKeys("Ojas@15251525");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Technology
		  Select dropdown = new Select(driver.findElement(By.id("domain")));
	      List<WebElement> options = dropdown.getOptions();
	      Random random = new Random();
	      int index = 1 + random.nextInt(options.size()-1);
	      String randomTech = options.get(index).getText();
	      dropdown.selectByVisibleText(randomTech);
	       
	    //Phone Number
	        driver.findElement(By.id("phoneNumber")).sendKeys(PhoneNumber);
	        
	    //Gender
	        List<String> ids = new ArrayList<String>();
	        ids.add("option1");
	        ids.add("option2");
	        Random random1 = new Random();
	        int randomIndex = random1.nextInt(ids.size());
	        String selectedId = ids.get(randomIndex);
	        driver.findElement(By.id(selectedId)).click();
	        
	     //Choose IMG
	        WebElement fileInput = driver.findElement(By.id("userpic"));
	        String imagePath = "C:\\Users\\vc21352\\Downloads\\Choloate.jpg";
	        fileInput.sendKeys(imagePath);
            Thread.sleep(3000);
	        
	    //Submit
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();   
	}

}
