package com.ust.collections.seachsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinearSearchDemo {

	public static void main(String[] args) {
	List list=Arrays.asList(2,3,1,4,5,78,2,3,2,2,2,2);
	
	System.out.println(list.contains(5)); //slow
	
	
	Set<Integer> set=new HashSet<>();
	set.add(56);
	set.add(12);
	set.add(76);
	set.add(33);
	System.out.println(set);
	System.out.println(set.contains(77));
	List l=new ArrayList();
	l.addAll(set);
	System.out.println(Collections.binarySearch(l,12));
	
	int index=Collections.binarySearch(list, 4);
	System.out.println("found at index:"+index);
	System.out.println(Collections.frequency(list, 2));
	
		

	}

}
