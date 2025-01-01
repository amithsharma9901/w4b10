package com.ust.oops;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Arith{
	
	int op(int a,int b);
	
}
public class functionalInterfaceDemo {

	public static void main(String[] args) {
		
		Arith arith=(a,b)->a+b;
		System.out.println(arith.op(4, 5));
		
		Arith arith1=(x,y)->x*x-y*y;
		System.out.println(arith1.op(7, 5));
		
		Consumer<Integer> c=(x)->System.out.println(x*x*x);
		c.accept(6);
		
		Supplier<Integer> s=()->99*10;
		System.out.println(s.get());
		
		Predicate<Integer> p=(x)->x%2==0;
		System.out.println(p.test(5));
		System.out.println(p.test(8));
		
		Function<Integer,Integer> f=(x)->x*x+99;
		System.out.println(f.apply(8));
	}
}
