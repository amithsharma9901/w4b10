package com.ust.exceptions;

public class ExApp2 {

	public static void main(String[] args) {
	

		try {
			try {
			int a[]= {3,4,5};
			System.out.println(a[4]);
			}
			catch (ArrayIndexOutOfBoundsException e)  //to catch exception, display exception message
			{    //System.out.println(e.getMessage());
				e.printStackTrace();
			}
			int c=10/0; //exit
			System.out.println("REsult :"+c);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
		
		
	}

}
