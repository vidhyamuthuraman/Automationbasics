package com.demos;

import static org.junit.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListenerTestng {
	@BeforeTest
	public void setup()
  {
	 System.out.println("open browser");
  }
  
	
	@Test
  public void testcase1() 
  { assertTrue(true);
  }
 @Test 
  public void testcase2()
  {
	  assertTrue(false);
  }
  @Test
  public void testcase3() 
  {
	  assertTrue(true);
  }
  
  @AfterMethod
public void getresult(ITestResult result)

{
	  if(result.getStatus()==ITestResult.SUCCESS)
	   {
		  System.out.println("Log to report");
		  }
	  else if(result.getStatus()==ITestResult.FAILURE)
	  {
		  System.out.println("Take screenshot");
	  }
	  
		  
	  
}
}
