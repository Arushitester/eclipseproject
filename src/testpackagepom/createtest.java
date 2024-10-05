package testpackagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackagepom.createpage;

public class createtest {
	WebDriver driver;
@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
		@Test
		public void createpagetest()
		{
			createpage cpage=new createpage(driver);
			cpage.createpageClick();
			cpage.textverify();
			cpage.sign();
		}
	

}
