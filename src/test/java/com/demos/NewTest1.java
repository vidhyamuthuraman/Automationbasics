package com.demos;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
      static WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ctvla\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver=BrowserConfig.Methodconfig();
		 driver.get("https://www.google.com/");	
		 System.out.println("Browser config");
		 
	}
  
	@Test
  public void testcase1() 
  {
	 
	  driver.findElement(By.name("q")).sendKeys("testng");
	  //w.sendKeys("textNG");
	  System.out.println("Test case1");
	  
  }
  
 @Test
  public void testcase2()
  {
	  driver.findElement(By.linkText("Images")).click();
	  System.out.println("Test case 2");
	 
  }
  
  @AfterMethod
  public void teardown() throws Exception
  {
	  Thread.sleep(2000);
	  driver.close();
	  System.out.println("Closing");
  }
  
  
}

 

