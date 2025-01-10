package com.ust.collections.seachsort;
import java.util.Arrays;
public class BubblesortDemo {
	public static void main(String[] args) {
		Integer a[]= {4,3,2,5,1,6,9,7,8};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		}
		Arrays.asList(a).stream().forEach(x->System.out.println(x));
	}
}
