import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rishiherbal {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test()
	{
		String actualtitle	=driver.getTitle();    //title comparison
		String Exptitle="rishiherbal";
		if(actualtitle.equals(Exptitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		//total link
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		System.out.println("Total no.of links="+li.size());
		}
		//check for food text
		
		{
		String src=driver.getPageSource();
		
		if(src.contains("food"))
		{
			System.out.println("text found");
		}
		else
		{
			System.out.println("Text not found");
	}
		//click health menu
		{
		driver.findElement(By.xpath("//div[@id='menu']/a[2]")).click();
		}
		}
		@After
		public void shut()
		{
 driver.close();
	}
	
}
