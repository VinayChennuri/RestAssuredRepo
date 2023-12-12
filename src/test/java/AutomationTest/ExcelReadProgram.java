package AutomationTest;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadProgram {
	
	@Test
	public void excelRead() throws Exception
	{
		
//		Faker faker = new Faker();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://192.168.3.106:8890/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Sign up")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File fs = new File("C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(fs);
		XSSFWorkbook xw = new XSSFWorkbook(fi);
		XSSFSheet sh= xw.getSheetAt(0);
		
		//String EmpID       = sh.getRow(1).getCell(1).getStringCellValue();
		String EmpName = sh.getRow(1).getCell(2).getStringCellValue();
		String Email = sh.getRow(1).getCell(3).getStringCellValue();
		String Tech = sh.getRow(1).getCell(4).getStringCellValue();
		//System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(Email);
		//System.out.println(Tech);
		xw.close();
		
	}

}
