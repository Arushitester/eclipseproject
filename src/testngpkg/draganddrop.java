package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
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

		WebElement dest=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement src=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		  Actions act1=new Actions(driver); 
		  act1.dragAndDrop(src, dest).perform();
		  WebElement amtdest=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement amtsrc =driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		  Actions act2=new Actions(driver); 
		  act2.dragAndDrop(amtsrc, amtdest).perform();
		 
		  
		  WebElement dest2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			WebElement src2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			Actions act3=new Actions(driver);
			act3.dragAndDrop(src2, dest2).perform();
			  WebElement amtdest2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
				WebElement amtsrc2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
				Actions act4=new Actions(driver);
				act4.dragAndDrop(amtsrc2, amtdest2).perform();
				
				WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
				
				if(button.getText().equals("Perfect"))
				{
					System.out.println("Perfect");
				}
				
				
		  
		  
	}
	

}
