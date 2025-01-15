package com.training.day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

interface Arith {
	int add(int a,int b);
	int product(int a,int b);
	//int getName();
	
	 default String getMessage() {//java8
		 return "welcome";
	 }
	 
	 static void getAddress() {//java8
		 System.out.println("Hyderabda,India");
	 }
	
}

interface Calc extends Arith{
	int sq(int x);
	@Override
	default String getMessage() {
		return "Welcome to FSD";
	}
	
	static void getCity() {
		System.out.println("Chennai");
	}
}
class ArithImpl implements Arith,Calc{
	public int add(int a,int b) {
		return a+b;
	}
	
	 public int product(int a,int b) { 
		 return a*a+b*b; 
		 }
	 public int sq(int x) {
		 return x*x;
	 }
	
	
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
	
		Arith a=new ArithImpl();
		System.out.println(a.add(4, 5));
		System.out.println(a.product(4, 5));
		
		System.out.println(a.getMessage());

		Calc c=new ArithImpl();
		System.out.println(c.sq(5));
		System.out.println(c.getMessage());  //default, abstract
		
		Arith.getAddress();  //static
		Calc.getCity();  //static
		
		//List interface,Collection
		
		List<Integer> list=Arrays.asList(3,2,4,5,6,7,8);
		
	//	for(int i=0;i<list.size();i++)
		//	System.out.println(list.get(i));
		
		//for(Integer i :list)
		//	System.out.println(i);
		
		list.forEach(x->System.out.println(x));
		
		HashSet<Integer> s=new HashSet<>();
		s.add(4);
		s.add(6);
		s.add(2);
		s.forEach(y->System.out.println(y));
		
		
	}

}
