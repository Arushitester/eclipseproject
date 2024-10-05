package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class redifng {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
	}
//	@BeforeMethod     //refresh option can be given so after every test the page refreshes
	
	@Test
	public void logo()
	{
		WebElement logo= driver.findElement(By.xpath("//[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img]"));
boolean b=logo.isDisplayed();
if(b)
{
	System.out.println("logo is present");
}
else
{
	System.out.println("logo is not present");
}
	
	}
	public void radio()
	{
		WebElement radio= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
boolean s=radio.isSelected();
if(s)
{
	System.out.println("button selected");
}
else
{
	System.out.println("button not selected");
}
	}
	
	public void account()
	{
		WebElement account= driver.findElement(By.xpath("//*[@id=\"Register]"));
boolean s=account.isEnabled();
if(s)
{
	System.out.println("button enabled");
}
else
{
	System.out.println("button disabled");
}
	}
	

}
