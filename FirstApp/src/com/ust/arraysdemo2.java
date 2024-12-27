package com.ust;

import java.util.Arrays;

public class arraysdemo2 {

	public static void main(String[] args) {
	int m[]= {45,78,98};
	
	//converting primitives into objects 
	Arrays.stream(m).boxed().forEach(x->System.out.println(x));
	
	System.out.println("====================");
	Integer m1[]= {56,78,98};
	
	Arrays.asList(m1).forEach(x->System.out.println(x));

	}

}
