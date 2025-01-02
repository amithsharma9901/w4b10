package com.ust.exceptions;

public class ExApp1 {

	public static void main(String[] args) {
	

		try {
			int c=10/0; //exit
			System.out.println("REsult :"+c);
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	String s="java";
		
	//	System.out.println(s.substring(5,8));
		
		try {   //to raise exception
			  int a[]= {3,4,5};
			  System.out.println(a[4]);
		    } 
		catch (ArrayIndexOutOfBoundsException e)  //to catch exception, display exception message
		{    //System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Done");
		
		
	}

}
