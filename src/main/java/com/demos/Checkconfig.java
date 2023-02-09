package com.demos;

import org.openqa.selenium.WebDriver;

public class Checkconfig {

	static WebDriver driver;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ctvla\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=BrowserConfig.Methodconfig();
		
	}
}
