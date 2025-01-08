package com.ust.collections.stackandqueue;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(50);
		System.out.println(s);
		//System.out.println(s.pop());
		System.out.println(s.peek());
		s.empty();
		System.out.println(s.isEmpty());
		
		
		
	}
}
