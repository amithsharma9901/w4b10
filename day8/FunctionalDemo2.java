package com.training.day8;

interface Cal<T>{
	T op(T a,T b);
	
}

public class FunctionalDemo2 {

	public static void main(String[] args) {
		
		Cal<Integer> c1=(a,b)->a+b;
	System.out.println(c1.op(3,4));
	
	Cal<Double> c2=(x,y)->x*y;
	System.out.println(c2.op(5.6, 3.4));
	}
}
