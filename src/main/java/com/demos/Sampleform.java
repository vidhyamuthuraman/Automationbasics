package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampleform {
public static void main(String args[])
{  
	
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mycontactform.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Sample Forms")).click();
	driver.findElement(By.xpath("//input[@type='checkbox'][@value='0']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox'][@value='1']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox'][@value='2']")).click();
	driver.findElement(By.xpath("//input[@ id='subject']")).sendKeys("vidhya");
	driver.findElement(By.id("email")).sendKeys("vidhya@yahoo.co.in");
	driver.findElement(By.id("q1")).sendKeys("word");
	driver.findElement(By.id("q2")).sendKeys("Checking"+"\n"+"Multiple lines");
	
	WebElement drop=driver.findElement(By.id("q3"));
	Select s=new Select(drop);
	s.selectByValue("Second Option");
	
	driver.findElement(By.xpath("//input[@type='radio'][@value='Third Option']"));
	driver.findElement(By.xpath("//input[@id='q5'][@value='Yes']"));
	driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='Second Check Box']"));
	driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='Fourth Check Box']"));
	driver.findElement(By.id("q7")).sendKeys("06-06-2023");
	driver.findElement(By.id("q7")).sendKeys("Keys.ESCAPE");
	
	
	WebElement drop1=driver.findElement(By.id("q8"));
	Select s1=new Select(drop1);
	s1.selectByVisibleText("TX");
	
	WebElement drop2=driver.findElement(By.id("q9"));
	Select s2=new Select(drop2);
	s2.selectByValue("United States of America");
	
	WebElement drop3=driver.findElement(By.id("q10"));
	Select s3=new Select(drop3);
	s3.selectByIndex(6);
	
	WebElement drop4=driver.findElement(By.name("q11_title"));
	Select s4=new Select(drop4);
	s4.selectByIndex(1);
	
	driver.findElement(By.xpath("//input[@type='text'][@name='q11_first']")).sendKeys("vidhya");
	driver.findElement(By.xpath("//input[@type='text'][@name='q11_last']")).sendKeys("Muthuraman");
	
	WebElement drop5=driver.findElement(By.name("q12_month"));
	Select s5=new Select(drop5);
	s5.selectByIndex(3);
	
	WebElement drop6=driver.findElement(By.name("q12_day"));
	Select s6=new Select(drop6);
	s6.selectByIndex(13);
	
	WebElement drop7=driver.findElement(By.name("q12_year"));
	Select s7=new Select(drop7);
	s7.selectByIndex(7);
	
	WebElement file=driver.findElement(By.xpath("//input[@id='attach4589']"));
	file.sendKeys("C:\\Users\\ctvla\\Downloads\\Selenium training\\Links and references.txt");
	
	WebElement str=driver.findElement(By.xpath("//*[@id='verification_image']"));
     
		
	driver.findElement(By.xpath("//*[@id='visver_code']")).sendKeys("F9A4A");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	
	
	
	
}
}
