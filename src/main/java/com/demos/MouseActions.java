package com.demos;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://demo.automationtesting.in/Alerts.html

public class MouseActions {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		

		//SIMPLE MOUSE ACTION
		/*driver.get("https://www.amazon.com");
		WebElement acc=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a=new Actions(driver);
		a.moveToElement(acc).build().perform();
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[5]/span")).click();*/
		
		
		
		//WHEN MOUSE IS MOVED IT SHOWS MESSAGE
		//*[contains(@id,'yui_3_17_2_1_1')][contains(@class,'yui3-shape yui3-svgShape')][@fill="#a86f41"]
		//*[@id="yui_3_17_2_1_1673312847978_21_0_1"]
		driver.navigate().to("https://clarle.github.io/yui3/yui/docs/charts/charts-pie.html");
		WebElement w=driver.findElement
				(By.xpath("//*[contains(@id,'yui_3_17_2_1_1')][contains(@class,'yui3-shape yui3-svgShape')][@fill=\'#a86f41\']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).build().perform();
		
		
		/*WebElement green=driver.findElement
		(By.xpath("//*[contains(@id,'yui_3_17_2_1_1')][contains(@class,'yui3-shape yui3-svgShape')][@fill=/'#295454'/]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(green).build().perform();
		//System.out.println(green.getText());*/
		   
		
		//DRAG AND DROP
		/* driver.navigate().to("https://jqueryui.com/droppable/");
		   WebElement frame=driver.findElement(By.className("demo-frame"));
		   driver.switchTo().frame(frame);
		   WebElement src=driver.findElement(By.id("draggable"));
	        WebElement dest=driver.findElement(By.id("droppable"));
	        Actions a1=new Actions(driver);
	        a1.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
	        //or we can use this statement . a1.dragAndDrop(src, dest); */

		
		
				
	}
}
