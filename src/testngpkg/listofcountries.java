package testngpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listofcountries {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement countryelement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select country=new Select( countryelement);
		java.util.List<WebElement> C=country.getOptions();
		System.out.println("total no.of countries"+C.size());
		
		int i=1;
		for(WebElement e:C)
		{
			System.out.println(i+"."+e.getText());
			i++;
		}
		
		driver.close();
	}
	
	
	
}
