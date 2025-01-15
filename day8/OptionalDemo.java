package com.training.day8;

import java.util.Optional;

public class OptionalDemo { //of, ofNullable ,isPresent() - boolean , get(),ifPresent - lambda consumer 
	   //orElse, orElseThrow()

	public static void main(String[] args)  throws Exception{
		Optional<Integer> o6=Optional.empty();
		Optional<Object> oo6=Optional.ofNullable(10);
		/*if(isEmpty())
			System.out.println("present");
		else
			System.out.println("no data");
			
			*/
		Optional<Integer> o1=Optional.ofNullable(99); //Optional Integer  empty
		Optional<Integer> o2=Optional.ofNullable(null);
		System.out.println(o2);
		System.out.println(o2.orElse(45));
		System.out.println(o2.orElse(99));
		System.out.println(o2.orElseThrow(Exception::new));
		/*
		try {
			
		}
		catch(Exception e) {
			
		}
		*/
		Optional<Double> o4=Optional.of(2323.45);
		Optional<String> o5=Optional.of("Java");
		Integer o3=null;
		System.out.println(o2.get()+50);
		if(o1.isPresent()) //boolean 
			System.out.println(o1);
		else
			System.out.println("Value not present");
		o1.ifPresent(x->System.out.println(x));
		Integer i1=new Integer(10); //object
		System.out.println(i1.intValue());
		int i2=10;//number primitive
		System.out.println(i2);
		
	}
}
