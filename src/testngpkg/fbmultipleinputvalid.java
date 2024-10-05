package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.binary.XSSFBSheetHandler;
//import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbmultipleinputvalid {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");  //open facebook
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\91623\\Desktop\\fbdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh= wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"-------"+pswd);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pswd);
			driver.findElement(By.xpath("//input[@name='login']")).click();
			
			driver.navigate().refresh();
		
		}
		
	}

}
