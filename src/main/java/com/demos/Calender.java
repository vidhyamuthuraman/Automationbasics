package com.demos;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String args[]) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String d="20";
		driver.navigate().to("https://www.ixigo.com/flights");
		driver.findElement(By.xpath("//div[contains(text(),'Departure')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		
	
		
		
		
		
		while(true)
		{
			String  monthtext=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			String[] mon=monthtext.split(" ");
			if(mon[0].equalsIgnoreCase("June"))
			{
				break;
			}
			else
				{driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();}
			
		}
		
		
		List<WebElement> date=driver.findElements(By.xpath
				("(//table[contains(@class,'rd-days')])[1]//td[contains(@class,'rd-day-body')]//div[1]"));
		for(int i=0;i<date.size();i++)
		{
			//System.out.println(date.get(i).getText());
			if(date.get(i).getText().equals(d))
			{
				//System.out.println(date.get(i));
				date.get(i).click();
				break;
			}
			
			
		}
		while(true)
		{
			String retmonth=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			String[] ret=retmonth.split(" ");
			if(ret[0].equalsIgnoreCase("October"))
					{
				       break;
				    
					}
			else
			{
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			}
		}
			
		
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Return')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
				
		while(true)
		{
			String retmonth=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			String[] ret=retmonth.split(" ");
			if(ret[0].equalsIgnoreCase("October"))
					{
				        break;
				    
					}
			else
			{
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			}
		}
			
		
		/*while(!month.equals("May 2023")) 
		{
			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
		  month=driver.findElement(By.xpath("//div[@class='rd-month-label']")).getText();
			
		}*/
		
				
	}

}
