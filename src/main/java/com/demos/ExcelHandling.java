package com.demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\ctvla\\Downloads\\Selenium training\\Excel sheets\\Sample.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		int totalrows=sheet.getPhysicalNumberOfRows();
		Row rowcell=sheet.getRow(0);
		int totalcolumn=rowcell.getPhysicalNumberOfCells();
		System.out.println("Number of rows"+totalrows);
		System.out.println("Number of columns"+totalcolumn);
		DataFormatter format=new DataFormatter();
		/*for(int i=0;i<totalrows;i++)
		{
		   for(int j=0;j<totalcolumn;j++)
		   {
			  System.out.print(format.formatCellValue(sheet.getRow(i).getCell(j))+" "); 
		   }
		   System.out.println();
		
	}*/

String [][] arr=new String[totalrows][totalcolumn];

for(int i=0;i<totalrows;i++)
{     

   for(int j=0;j<totalcolumn;j++)
   {
	   arr[i][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
	   System.out.print(arr[i][j]+" ");
		
	}
   System.out.println();
}
}
}

