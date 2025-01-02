package com.ust.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExApp6 {

	
	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("c:\\javatraining\\agenda.txt");// file , db, socket
			int a[]= {3,4,5};
			System.out.println(a[2]);
			
			int c=10/2; //exit
			System.out.println("REsult :"+c);
			String name="ram";
			System.out.println(name.length());
		} //multi catch block
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException | NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
