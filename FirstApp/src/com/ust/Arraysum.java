package com.ust;

import java.util.Arrays;

public class Arraysum {

	public static void main(String[] args) {

		//int s=0;
		//Integer marks[]= {89,79,87};
		
		
		int m[]= {34,45,56};
		
		//Arrays.asList(marks).forEach(s->System.out.println(s));
		
		Arrays.stream(m).boxed().forEach(s1->System.out.println(s1));
		/*
		for(int i=0;i<marks.length;i++)
			System.out.println(marks[i]);
		
		int t=s+10;
		for(int m:marks)
			s+=m-90; 
		
		System.out.println("Sum of marks:"+s);
		*/

	}

}
