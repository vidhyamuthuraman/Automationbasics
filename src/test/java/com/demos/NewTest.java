package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\ctvla\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://www.google.com/");	
		 System.out.println("Browser config");*/
		
		
		driver=BrowserConfig.Methodconfig();
		driver.get("https://www.google.com/");	
		
		 
	}
  @Test
  public void testcase1() 
  {
	 	 driver.findElement(By.name("q")).sendKeys("textNG");
	      System.out.println("Test case1");
	  
  }
  
 @Test
  public void testcase2()
  {
	 
	  driver.findElement(By.linkText("Images")).click();
	  System.out.println("Test case 2");
	 
  }
  
  @AfterTest
  public void teardown() throws Exception
  {Thread.sleep(2000);
	  driver.close();
	  System.out.println("Closing");
  }
  
  
}
