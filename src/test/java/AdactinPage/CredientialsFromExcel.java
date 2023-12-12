package AdactinPage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CredientialsFromExcel {
public static WebDriver driver;
	
	@Test(dataProvider = "data")
	public void cred(String us, String ps) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("password")).sendKeys(ps);
		System.out.println("Usename: "+ us);
		System.out.println("Password: "+ ps);
		driver.close();
	}
	
	@DataProvider(name = "data")
	public  Object[][] idpass() throws Exception
	{
		File sr = new File("‪C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(sr);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		Object[][] ab = new Object[1][2];	
		ab [0][0] = sh.getRow(0).getCell(1).getStringCellValue();
		ab [0][1] = sh.getRow(1).getCell(1).getStringCellValue();
		return ab;
	}
//	
//@DataProvider (name="data")
//	
//	public Object[][] pass(){
//		
//		Object [][] data = new Object [1][2];
//		
//		data[0][0] = "vinaykumarchennuri1";
//		
//		data[0][1] = "8187826150";
//		
//		return data;
//		
//}
		
	}

