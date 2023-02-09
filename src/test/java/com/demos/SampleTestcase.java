package com.demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class SampleTestcase {
	
	WebDriver driver;
 
	@BeforeTest(alwaysRun =true)
	  public void setup() {
		  
		  driver=new ChromeDriver();
		  driver.get("https://www.mycontactform.com/");
	  }
	
	
	@Test(groups={"smoke","regression"})
  public void csampleforms()
  {
		WebElement w=driver.findElement(By.linkText("Sample Forms")); 
		Actions a=new Actions(driver);
		a.click(w).perform();
		
  }
	@Test(groups="smoke")
  public void scheckbox()
  {  
	  driver.findElement(By.xpath("//input[@type='checkbox'][@value='0']")).click();
	  
	 
  }
	@Test(groups="regression")
  public void xsubject()
  {
	  driver.findElement(By.xpath("//input[@ id='subject']")).sendKeys("vidhya");
  }
	
	
	@Test(groups="regression")
	public void yenteremail()
	{
		driver.findElement(By.id("email")).sendKeys("vidhya@yahoo.co.in");
	}

  @AfterTest(alwaysRun=true)
  public void teardown() throws Exception {
	  Thread.sleep(2000);
	  driver.close();
  }

}
