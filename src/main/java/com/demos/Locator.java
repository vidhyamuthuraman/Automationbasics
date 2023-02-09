package com.demos;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mycontactform.com");
	WebElement sampleforms=driver.findElement(By.linkText("Sample Forms"));
    sampleforms.click();
   /* driver.findElement(By.id("subject")).sendKeys("vidhya");
    driver.findElement(By.id("email")).sendKeys("vidhyamuthuraman@yahoo.co.in");
    driver.findElement(By.id("q1")).sendKeys("Hello");
    driver.findElement(By.id("q2")).sendKeys("Hello world"+"\n" +"Hello second line");
    driver.findElement(By.xpath("//input[@type='checkbox'][@name='email_to[]'][@value='0']")).click(); 
  driver.findElement(By.xpath("//input[@type='checkbox'][@name='email_to[]'][@value='1']")).click();
  driver.findElement(By.xpath("//input[@type='checkbox'][@name='email_to[]'][@value='2']")).click();
   driver.findElement(By.xpath("//input[@value='Fourth Option']")).click();
   //driver.findElement(By.xpath("(//input[@name='checkbox6[]'])[3]")).click();
   driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
 /*  List<WebElement> links=driver.findElements(By.xpath("//input[@type='checkbox']"));
   System.out.println("Total Check box : "+links.size());
   List<WebElement>link1=driver.findElements(By.xpath("//input[@type='radio']"));
  System.out.println("Total Radio buttons : "+link1.size());
  
 // List<WebElement> link2=driver.findElements(By.xpath("//input[@id='q3']"));
  //System.out.println("Total list in drop down list"+link2.size());*/
   
 // List <WebElement> link3=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
  //System.out.println("Total links in drop down list"+link3.size());
 
 // int i=1,j=1;
 // driver.findElement(By.xpath("//*[@id='left_col_top']/ul[i]/li[j]//a")).click();
/* for(int i=0;i<link3.size();i++)
	 
 {    if(!(link3.get(i).getText().isEmpty()))
          { //System.out.println(link3.get(i).getText());
           link3.get(i).click();
           Thread.sleep(2000);
           //driver.navigate().back();
           link3=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
           }       
         //System.out.println(link3.get(i).getText());
}*/
	
  List <WebElement> link3=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
  System.out.println("Total links in drop down list"+link3.size());
  for(int i=0;i<link3.size();i++)
 {	 link3.get(i).click();
    Thread.sleep(2000);
     link3=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
 }

}
}
 


