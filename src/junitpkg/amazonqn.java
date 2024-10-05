package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonqn {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void search()
	{
		WebElement searchfield= driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click(); //click cart
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();//click amazon mini tv
		driver.navigate().back();                          // navigate to back
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span[@class='nav-line-1 nav-progressive-content']")).click(); //click Hello sign in
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a")).click(); // click hamburger icon
	}
}
