package webdrivernew;

import org.openqa.selenium.chrome.ChromeDriver;

public class webpagesrc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		
		if(src.contains("Images"))
		{
			System.out.println("String found");
		}
		else
		{
			System.out.println("String not found");
	}
       driver.close();
	}
}
