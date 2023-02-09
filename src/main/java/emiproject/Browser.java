package emiproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		driver.findElement(By.xpath("//a[@title=\"Calculators\"]")).click();
		driver.findElement(By.linkText("Home Loan EMI Calculator")).click();
	}

}
