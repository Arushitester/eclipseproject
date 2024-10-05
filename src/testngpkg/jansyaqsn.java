package testngpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

@Test
public class jansyaqsn {

	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{driver=new ChromeDriver();
		driver.get("https://janasya.com/");}
	public void test()
	{String actualtitle	=driver.getTitle();    //title comparison
		String Exptitle="Janasya";
		if(actualtitle.equals(Exptitle)){
			System.out.println("right title");}
		else
		{System.out.println("wrong title");}
	}
	public void linkverification() throws IOException
	{List<WebElement> li=driver.findElements(By.tagName("img"));
		int l1=li.size();
		int l2=400;
		if(l1==l2)
		{System.out.println("PASS");}
		else
		{System.out.println("FAIL");}
		{File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("E://janasyascreenshot.png"));
			}
	}
}
