package com.demos;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class Browseroption {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter browser");
		String s1=s.nextLine();
		//System.out.println(s1);
		if(s1.equals("chrome"))
		{
			System.out.println("chrome");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
		else if(s1.equals("firefox"))
		{
			System.out.println("firefox");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
		else
		{	System.out.println("Edge");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		}

	}
}