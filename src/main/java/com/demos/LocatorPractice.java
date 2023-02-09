package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("endpoint")).click();
		driver.findElement(By.id("user-name")).sendKeys("vidhya");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.id("login-button")).click();
		
		
		
		
	}
}
