package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class clickpgm {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;

	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		  Actions act=new Actions(driver); 
		   act.contextClick(rightclick).perform();
		   act.contextClick(rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		   
		   
		   System.out.println("Right click Context Menu displayed");
		   //WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
			Alert a =driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println(alerttext);
			a.accept();
		
		
	}
	
}
