package com.demos;
import java.util.Scanner;
public class RectanglePerimeter {

//public static void main(String args[])
	//{
		
		public void getvalues()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter length");
			s.nextDouble();
			System.out.println("Enter width");
			s.nextDouble();
						
		}
		
		public double rectperi(double length,double width)
		{
			double peri=0;
			peri=2*(length*width);
			return peri;
			
		}
	}
	



