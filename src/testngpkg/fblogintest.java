package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");  //open facebook
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("arsh");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String expurl="https://www.facebook.com/profile";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println(" Invalid login");
		
	}
	}
	

}
