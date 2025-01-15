package com.training.day8;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculator{//functionalInterface - invoke lambda
	
	int op(int a,int b);
	//double sq(double x);
	
	default void show() {
		System.out.println(" default method...");
	}
	static void disp() {
		System.out.println("static method");
	}
}

class CalculatorImpl implements Calculator{
	public int op(int a,int b) {
		return a-b;
	}
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// ()->  {  statement1, st2... ;} 
		//()-> {return x;}
		//
		
		Calculator c=(a,b)->a-b;
		System.out.println(c.op(5, 6));
		
		Calculator c1=(a,b)->a*a+b*b;
		System.out.println(c1.op(3, 4));
		
		Calculator c2=new CalculatorImpl();
		System.out.println(c2.op(8, 4));
		c2.show();  //default
		
		Calculator.disp(); //static method
		
		//predefined FI
		
		Consumer<String> consumer=(s)->System.out.println(s.toUpperCase());
		consumer.accept("shyamala");
		
		Consumer<Integer> consumer1=(x)->System.out.println(x*x);
		consumer1.accept(10);
		
		Supplier<Integer> sup=()->new Random().nextInt();
		System.out.println(sup.get());
		
		Predicate<Integer> pre=(x)->x%2==0;
		System.out.println(pre.test(8));
		
		IntFunction<Integer> fun=(x)->x*x*x;
		System.out.println(fun.apply(9));
		
		Function<String,Integer> fun1=(x)->x.length();
		System.out.println(fun1.apply("java123"));
		
		BiFunction<Integer,Integer,Integer> fun2=(x,y)->(x>y)?x:y;
		System.out.println(fun2.apply(9,13));
		
		Consumer<String> consumer3=(x)->System.out.println(x);
		consumer3.accept("welcome");
		
		Consumer<String> consumer4=System.out::println;//:: method reference
		consumer3.accept("welcome4");
	}
}
