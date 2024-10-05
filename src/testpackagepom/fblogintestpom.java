package testpackagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackagepom.fbloginpom;

public class fblogintestpom {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		fbloginpom ob=new fbloginpom(driver);
		ob.setValues("abc@gmail.com","abc123");
		ob.loginclick();
	}
	
	
}
