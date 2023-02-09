package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
	public static void main(String args[]) 
	{
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.ixigo.com/flights");
	
	WebElement depature=driver.findElement(By.xpath("//input[@placeholder='Depart']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click(0);" ,depature);
	js.executeScript("window.scrollTo(250,1000)");
	
	WebElement from =driver.findElement(By.xpath("//div[contains(text(),'From')]"));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click(0)", from);
	
	//js.executeScript("window.scrollTo(0,-500)");
	
	

}
}

