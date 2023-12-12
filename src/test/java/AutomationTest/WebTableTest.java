package AutomationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
public static WebDriver driver;

   @Test
   public void webtable() throws Throwable
   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Print Column
		List <WebElement> a = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr/td[3]"));
		for(WebElement t : a ) {
		System.out.println(t.getText());
		}
		System.out.println(a.size());
		
		// Print Table
        List <WebElement> x = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody"));
        for(WebElement y : x) {
        System.out.println(y.getText());
		}
        System.out.println(x.size());
        
        // Print Row
        List <WebElement> f = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[5]"));
        for(WebElement r : f ) {
        	System.out.println(r.getText());
        }
        System.out.println(f.size());
        
        // Print Specific Name
        
        List <WebElement> i = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[5]/td[4]"));
        for(WebElement c:i) {
        	System.out.println(c.getText());
        }
        System.out.println(i.size());
	}

}
