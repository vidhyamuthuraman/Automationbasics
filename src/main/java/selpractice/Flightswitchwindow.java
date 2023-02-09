package selpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flightswitchwindow {
	
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ixigo.com/flights");
		
		//Switching to Group booking
	   	driver.findElement(By.xpath("//a[@href='https://rocket.ixigo.com/group/index.html?p=desktop_header']")).click();
   		Set<String>windows=driver.getWindowHandles();
        List<String>windowlist=new ArrayList<>(windows);
        
        driver.switchTo().window(windowlist.get(1));
        
        driver.findElement(By.name("email")).sendKeys("vidhyamut@yahoo.co.in");
        driver.findElement(By.name("mobileNumber")).sendKeys("+91 9004568769");
        driver.findElement(By.name("travelDate")).sendKeys("04-23-2023");
       
        
        driver.findElement(By.name("origin")).sendKeys("MAA - Chennai, India");
        driver.findElement(By.name("destination")).sendKeys("IDI - Indiana, United States");
        driver.findElement(By.name("passengersNumber")).sendKeys("51");
        
        driver.findElement(By.name("preference")).sendKeys("No stops");
        driver.findElement(By.xpath("//button[@ type=\"submit\"]")).click();
        
        driver.switchTo().window(windowlist.get(0));
        
       //Moving to visa tab 
        //driver.findElement(By.xpath("//a[@href='https://ixigo.visa2fly.com?cbt=eyJpeGlVSUQiOiJhMjkxZTY4N2UwZGE0OTQ2OGFkNyJ9']")).click();
        
       WebElement w= driver.findElement(By.xpath("//a[@data='4']"));
       Actions A=new Actions(driver);
       A.moveToElement(w).build().perform();
		
		
		
		
		
	}

}
