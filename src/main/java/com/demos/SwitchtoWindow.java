package com.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWindow {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ctvla\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		/*driver.findElement(By.xpath("// a [@href='#Seperate']")).click();
		driver.findElement(By.xpath("// div [@id='Seperate']//button")).click();
		
		Set<String> windows=driver.getWindowHandles();
		List<String>windowlist=new ArrayList<>(windows);
		driver.switchTo().window(windowlist.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		driver.switchTo().window(windowlist.get(0));*/
		
		driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Set<String>windows=driver.getWindowHandles();
		List<String>windowlist=new ArrayList<>(windows);
		
		driver.switchTo().window(windowlist.get(1));
		driver.findElement(By.xpath("//a[@href='/documentation']")).click();
		driver.findElement(By.xpath("//a[@href='/documentation/webdriver/']")).click();
		driver.switchTo().window(windowlist.get(0));
		driver.switchTo().window(windowlist.get(1));
		
		
		
		
		
		
		
	}
}
