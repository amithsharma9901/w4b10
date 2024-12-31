package com.ust.oops;

public class MRide extends Ride{
	final int x=10;
	@Override
	int sq(int s) {  //dynamic , runtime , sub class
		return 4*s;
	}
	void show() {
		System.out.println(++x);
	}
	public static void main(String[] args) {
		
		Ride r=new Ride();
		System.out.println("Area of square:"+r.sq(5));
		
		r=new MRide();
		System.out.println("Perimeter of square:"+r.sq(5));
		MRide mr=new MRide();
		mr.show();
	}
}
