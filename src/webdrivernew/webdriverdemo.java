package webdrivernew;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {

	public static void main(String[] args) {
		//open browser
		ChromeDriver driver=new ChromeDriver();//creating object and calling it
		driver.get("https://www.google.com");
		
	String actualtitle	=driver.getTitle();    //title comparison
	String Exptitle="Google";
	if(actualtitle.equals(Exptitle))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	driver.close();
	}

}
