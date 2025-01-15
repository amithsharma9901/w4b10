package com.training.day8;

import java.util.StringTokenizer;

public class StringDEmo {
	
	String addStrings(String s1,String s2) {
		
		return s1.concat(s2);
	}
	
	public static void main(String[] args) {
		//literal, 1
		String s="java";
		
		//String object, 2 
		String s1=new String("j2ee");
		
		//immutable, create duplicate objects with many operations
		System.out.println(s.length());
		System.out.println(s.toUpperCase());//1
		System.out.println(s.toLowerCase());//1
		System.out.println(s.startsWith("j"));
		System.out.println(s.concat(" language"));//1
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("v"));
		System.out.println(" string tokenizer");
		String line="java training, virtual, Gotomeetingapp,6AM";
		String tokens[]=line.split(",");
		for (String st: tokens)
			System.out.println(st);
		
	
		StringTokenizer st1=new StringTokenizer(line,",");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		String p="python";
	//	StringBuffer sb=new StringBuffer(p);//slow,synchronized
		
		StringBuilder sb=new StringBuilder(p); //fast, not syncronized 
		
		//mutable, not create objects
		//append, insert,delete,reverse
		//syncronized
		sb.append("technology");
		System.out.println(sb);
		sb.insert(3,"xxx");
		System.out.println(sb);
		sb.delete(3, 8);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.reverse());
		String ss1=sb.toString();
		
		StringDEmo sd=new StringDEmo();
		System.out.println(sd.addStrings("ram","kumar"));
		
		String fullname=sd.addStrings("first name","last name");
		System.out.println(fullname);
	
	}
}
