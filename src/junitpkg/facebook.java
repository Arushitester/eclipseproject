package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");  //open facebook
	}
	@Test
	public void fb()
	{
		//driver.findElement(By.id("email")).sendKeys("abcdf@gmail.com");//find email and enter the given value
		//driver.findElement(By.id("pass")).sendKeys("12345");    //similarly find password field and enter the given value
		//driver.findElement(By.name("login")).click();     //find login button and do
		//using xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdf@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
