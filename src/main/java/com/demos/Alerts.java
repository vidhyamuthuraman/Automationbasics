package com.demos;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("// a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("// div[@id='CancelTab']//button")).click();
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		
		
		 driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		 driver.findElement(By.xpath("//div[@id='OKTab']//button")).click();
		 Alert a2=driver.switchTo().alert();
		 a2.accept();
		 
		 driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		 driver.findElement(By.xpath("// div[@id='Textbox']//button")).click();
		 Alert a3=driver.switchTo().alert();
		 a3.accept();
		 
		 
		
		//a1.dismiss();
		//a1.sendKeys(null);
		//a1.getText();
		
	}
}
