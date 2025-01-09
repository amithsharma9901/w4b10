package com.ust.collections.seachsort;

import java.util.Comparator;
import java.util.TreeSet;

class LengthComparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		if(s1.length()>s2.length())
			return 1;
		else
			if(s1.length()<s2.length())
				return -1;
			else
					return 0;
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//Set<Integer> set=new HashSet<>();
		TreeSet<Integer> set=new TreeSet<>();  //built in 
		//ArrayList<Integer> set=new ArrayList<>();  //explicit
		set.add(3);
		set.add(99);
		set.add(2);
		set.add(56);
		set.add(6);
		set.add(1);
		//Collections.sort(set);
		System.out.println(set);  //3 2 6 1
		
	//	TreeSet<String> set1=new TreeSet<>(new LengthComparator());
		TreeSet<String> set1=new TreeSet<>();
		
		set1.add("bindu");
		set1.add("kiran5");
		set1.add("ji");
		set1.add("anu");
		set1.add("arunkumar");
		System.out.println(set1);
		
		//java8
		Comparator<String> com=(s1,s2)->s1.length()-s2.length();
		set1.stream().sorted(com).forEach(s->System.out.println(s));

	}

}
