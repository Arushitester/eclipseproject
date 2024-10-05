package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void titleverification()
{
	String actualtitle=driver.getTitle();
	String exptitle="Google";
	if(actualtitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("pass");
	}
}
	@Test
	public void textverification()
	{
	String src=driver.getPageSource();
	
	if(src.contains("Images"))
	{
		System.out.println("text found");
	}
	else
	{
		System.out.println("Text not found");
}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}



