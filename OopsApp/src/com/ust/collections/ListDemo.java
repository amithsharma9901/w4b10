package com.ust.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//java.util.Collection

public class ListDemo {

	public static void main(String[] args) {
		
	//	List<Object> al=new ArrayList<>();  //cntl+shift+o
	//	List<Object> al=new LinkedList<>();
	//	List<Object> al=new Vector<>();
		HashSet al=new HashSet();
		al.add(33);
		al.add("java");
		al.add("java");
		al.add("java");
		al.add(67);
		al.add(99);
		al.add(55);
		al.add(67);
		al.add(99);
		al.add(55);
		al.remove(1);
		al.add(99);
		al.add(99);
	//	System.out.println(al.indexOf(99));
	//	System.out.println(al.lastIndexOf(99));
		System.out.println(al.contains(343));
		ArrayList a2=new ArrayList();
		a2.add(34);
		a2.add(56);
		a2.add(23);
		System.out.println(al);
		al.addAll(a2);
		System.out.println(al);
		//al.removeAll(a2);
		al.retainAll(a2);
		System.out.println(al);
		
		for(Object o: al)
			System.out.println(o);
	//	for(int i=0;i<al.size();i++)
	//		System.out.println(al.get(i));
		System.out.println("=====iterator=========");
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("Lambda=====");
			al.forEach(x->System.out.println(x));
		
	}

}
