package com.demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter {
	
	@BeforeMethod(alwaysRun=true)
	public void setup()
	{
		System.out.println("Browser config");
	}
	
	
	@Test(groups="Regression",dataProvider="testdata")
	public void testcase(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
/*	@Parameters({"username"})
	@Test(groups="smoke")
  public void testcase1(String user)
  {    System.out.println(user);
	  System.out.println("testcase1");
	  	  
	    }

 
  @Parameters({"password"})
  @Test(groups="smoke")
  public void testcase2(String pass) {
	  System.out.println("testcase2");
	  System.out.println(pass);
	  	  
	    }
  @Test	
  public void testcase3() {
	  System.out.println("testcase3");
	  	  
	    }
@Test

  public void testcase4() {
	  System.out.println("testcase4");
	  	  
	    }*/
  
  @AfterMethod(alwaysRun=true)
  public void tear()
  {
	  System.out.println("close");
  }
  @DataProvider(name="testdata")
  public Object[][] data()throws IOException
  
  {
	  File f=new File("C:\\Users\\ctvla\\Downloads\\Selenium training\\Excel sheets\\Sample.xlsx");
	  FileInputStream file=new FileInputStream(f);
	  XSSFWorkbook workbook=new XSSFWorkbook(file);
	  XSSFSheet sheet=workbook.getSheet("Sheet1");
	  int totalrows=sheet.getPhysicalNumberOfRows();
	   
	  Row rowcell=sheet.getRow(0);
	 int totalcolumn=rowcell.getPhysicalNumberOfCells();
	 DataFormatter format=new DataFormatter();
	  
	  String [][] arr=new String[totalrows][totalcolumn];

	  for(int i=0;i<totalrows;i++)
	  {     

	     for(int j=0;j<totalcolumn;j++)
	     {
	  	   arr[i][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
	  	 // System.out.print(arr[i][j]);
	  		
	  	}
	    //System.out.println(); 
	  }
	  
	  /*String datas[][]= {
				  {"vidhya","vi"},
				  {"Aravin","ara"}
		  };*/
		  return arr;
  }
  
}
