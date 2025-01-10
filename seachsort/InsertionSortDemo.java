package com.ust.collections.seachsort;

import java.util.Arrays;

public class InsertionSortDemo {
	public static void main(String[] args) {
		Integer a[]= {5,2,6,3,7,1,4,8};
		for (int i = 1; i < a.length; ++i) {
            int key = a[i];
            int j = i - 1;
           while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
		Arrays.asList(a).stream().forEach(x->System.out.println(x));
	}
}
