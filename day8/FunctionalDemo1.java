package com.training.day8;

@FunctionalInterface
interface Arith123{
	int op(int a,int b);
	static int product(int x) {
		return x;
	}
	default void show() {
		
	}
}

public class FunctionalDemo1 {

	public static void main(String[] args) {
		
		Arith123 a1=(a,b)->a+b;
		System.out.println(a1.op(4, 5));
		Arith123 a2=(int x,int y)->x*x+y*y;
		System.out.println(a2.op(6, 3));
		Arith123 a3=(int p,int q)-> {return p*q;};
		System.out.println(a3.op(2, 3));

	}

}
