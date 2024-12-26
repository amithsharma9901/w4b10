package com.ust;

public class StringDemo {

	public static void main(String[] args) {
		
		//immutable
 		String s=new String("java"); //heap, scp
		String s1="java"; ///literal ,scp 
		char s2[]={'j','a','v','a'};
		String ss2=new String(s2);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("j"));
		System.out.println(s.concat("language"));
		System.out.println(s.replace("a","e"));
		System.out.println(s);
		System.out.println(s.indexOf("v"));
		
		
		//mutable,synchronized
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb.insert(2, "xxxx"));
		System.out.println(sb.append(99));
		System.out.println(sb.delete(2, 6));
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		//slow
		StringBuilder sb1=new StringBuilder("java");
		System.out.println(sb1.insert(2, "xxxx"));
		System.out.println(sb1.append(99));
		System.out.println(sb1.delete(2, 6));
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		System.out.println(sb1.reverse());
	
		String s5=sb.toString();
		String s6=sb1.toString();

	}

}
