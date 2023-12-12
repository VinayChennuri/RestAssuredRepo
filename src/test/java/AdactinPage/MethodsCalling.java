package AdactinPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MethodsCalling extends AdactinTest {
	
	@Test
	public void call()
	{
	
	MethodsCalling ob = new MethodsCalling();
	ob.adactinlogin();
	ob.searchHotel();
	driver.findElement(By.id("Submit")).click();
	ob.selectHotel();
	ob.bookHotel();
	driver.findElement(By.id("cancel")).click();
	ob.bookItinerary();
	driver.findElement(By.id("logout")).click();
	driver.findElement(By.linkText("Click here to login again")).click();
	driver.close();

}
}
