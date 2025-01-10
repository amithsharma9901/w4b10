package com.ust.collections.seachsort;

import java.util.Arrays;

public class SelectionsortDemo {

	public static void main(String[] args) {
		Integer a[]= {5,2,6,3,7,1,4,8};
		int n=a.length;
		 for (int i = 0; i < n - 1; i++) {
	          
	            int min_idx = i;
	          
	            for (int j = i + 1; j < n; j++) {
	                if (a[j] < a[min_idx])
	                    min_idx = j;
	            }
           int temp = a[min_idx];
	            a[min_idx] = a[i];
	            a[i] = temp;
	        }
		 Arrays.asList(a).stream().forEach(x->System.out.println(x));

	}

}
