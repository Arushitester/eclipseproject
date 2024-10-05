import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleresponsecode {
	
	public void verifylink()
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
		
		for( webElement ele.li)
		{
			String link=ele.getAttribute("href");
				verifylink(link);
}
}
public void verifylink(String Link) {
	try
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("successful response code is 200---"+link);
		}
		else if(con.getResponseCode()==400)
		{
			System.out.println("broken link response code is 400---"+link);		}
	
	}
}
         catch(Exception e) {
        	 System.out.println(e.getMessage());
         }
	
}
}
