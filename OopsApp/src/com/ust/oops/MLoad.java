package com.ust.oops;

public class MLoad {//static poly , cmpile time , within class 
	void area(int s) {
		System.out.println("Square:"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("REctangle:"+(l*b));
	}
	void area(double r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	public static void main(String[] args) {
		MLoad ml=new MLoad();
		ml.area(4);
		ml.area(5, 6);
		ml.area(3.45);
	}
}
