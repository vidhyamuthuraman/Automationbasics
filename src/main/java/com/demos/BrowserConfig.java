package com.demos;

//import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class BrowserConfig {
	
	 public static WebDriver Methodconfig()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		//Actions a=new Actions(driver);
		//driver.navigate().to("https://www.ixigo.com/flights");
	}

}
