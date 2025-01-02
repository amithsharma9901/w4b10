package com.ust.exceptions;

import java.io.FileReader;

public class ExApp3 {

	public static void main(String[] args) {
	
		//Thread.sleep(500);//checked-compiletime
		//FileReader f=new FileReader("c:\\javatraining\\agenda.txt");//
		try {
			
			int a[]= {3,4,5};
			System.out.println(a[2]);
			
			int c=10/2; //exit
			System.out.println("REsult :"+c);
			String name="ram";
			System.out.println(name.length());
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)  //to catch exception, display exception message
		{    //System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
		
		
	}

}
