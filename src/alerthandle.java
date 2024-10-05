import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("file:///C:/Users/91623/Desktop/alertt.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a =driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ARSHI");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ANEES");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
