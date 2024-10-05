import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links="+li.size());
		//for (WebElement link : li )   //foreach loop.here declare the variable to store
		//System.out.println(link.getAttribute("href"));
		for (WebElement link : li )
		System.out.println(link.getText());
		//for( webElement ele.li)  here a variable id declared and storing the values in it.ele is the variable here.
		//String link=ele.getAttribute("href");
		//String linktext=ele.getText();
		//System.out.println(link+"------"+linktext);
		
		driver.close();
		
	}

}
