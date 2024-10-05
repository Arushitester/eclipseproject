package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fbng {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");  //open facebook
	}
	@Parameters({"un","pswd"})
	@Test
	public void test(String un,String pswd)
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
