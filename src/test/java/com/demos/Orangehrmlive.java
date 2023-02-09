package com.demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Orangehrmlive {
	static WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
    
	@Test(groups="Regression",dataProvider="testdata")
  public void login(String user,String pass) throws Exception {
	  
	  WebElement w=driver.findElement(By.xpath("//div/input[@name='username']"));
	  w.sendKeys(user);
	  WebElement w1=driver.findElement(By.xpath("//div/input[@name='password']"));
	  w1.sendKeys(pass);
	  WebElement w2=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		w2.click();
		System.out.println(driver.getCurrentUrl());
  }
	@Test(groups="smoke")
	public void testcase2()
	{
	System.out.println("I belong to smoke group");
	}
	
	
  @AfterMethod(alwaysRun=true)
  public void teardown() throws Exception
  {   Thread.sleep(2000);
	  driver.close();
	  
  }
  
  @DataProvider(name="testdata")
  public String[][] data() throws IOException
  {
	  File f=new File("C:\\Users\\ctvla\\Downloads\\Selenium training\\Excel sheets\\Sample.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getPhysicalNumberOfRows();
		Row rowcell=sheet.getRow(0);
		int totalcolumn=rowcell.getPhysicalNumberOfCells();
		DataFormatter format=new DataFormatter();
	  
	  
	  String [][] arr=new String[totalrows][totalcolumn];

	  for(int i=0;i<totalrows;i++)
	  {     

	     for(int j=0;j<totalcolumn;j++)
	     {
	  	   arr[i][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
	  	  // System.out.print(arr[i][j]+" ");
	  		
	  	}
	    // System.out.println();
	  }
 return arr;
  }
}
