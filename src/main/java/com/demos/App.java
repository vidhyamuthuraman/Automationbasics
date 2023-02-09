package com.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // System.setProperty("webdriver.chrome.driver","C:\\Users\\ctvla\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
    	driver.navigate().to("https://amazon.com");
    	driver.navigate().back();
    	driver.navigate().forward();
    	System.out.println(driver.getTitle());
    	System.out.println(driver.getCurrentUrl());
    	
    	//driver.quit();
       
    }
}
