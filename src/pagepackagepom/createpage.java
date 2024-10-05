package pagepackagepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createpage {
	WebDriver driver;
	By createpg=By.xpath("//*[@id=\"reg_pages_msg\"]/a");

By signup= By. xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	
	public createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void createpageClick()
	{
		driver.findElement(createpg).click();
	}
public void textverify()
{

	String src=driver.getPageSource();
	
	if(src.contains("Create a page"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
}
}

public void sign()
{
	driver.findElement(signup).click();
}
	
}

