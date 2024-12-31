package com.ust.oops;
class University{
	Integer id;
	String name;  //object
	static {
		System.out.println("sttaic block in University class");
	}
	static String country="India";//class 
	static void show() {
		System.out.println(country);
	}
}
public class StaticDemo {
	static {
		System.out.println(" sttaic block");
	}
	static void disp() {
		System.out.println("static method");
    }
	public static void main(String[] args) {
		disp();
		System.out.println(University.country);
		University.show();
		University u=new University();
		
	}

}
