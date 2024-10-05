package testngpkg;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datepicker {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com");
	}
	@Test
	public datepicker()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[3]/div/div/button[2]/span/span[2]/span[2]"));
		datepicker("November 2024","24");
	}
	public void datepicker(String expmonth,String expdate)
	{
		While(true)
		{
			WebElement monthdetails=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[3]/div/div/button[2]/span/span[2]/span[2]"));
		String month=monthdetails.getText();
			if(expmonth.equals(month))
			{
				System.out.println(month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span"));
			}
		}
		List<WebElement> datelist=driver.findElements(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[3]/div/button/time"));
		for(WebElement ele:datelist)
		{
			String date=ele.getText();
			if(date.equals(expdate))
			{
				ele.click();
				break;
				
			}
		
		
		}
	}

}
