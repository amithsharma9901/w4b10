package com.ust;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]= {3,4,5,6};
		int b[]=new int[5];
		System.out.println("====for loop======");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("========for each=======");
		for(int x:a)
			System.out.println(x);
		System.arraycopy(a, 1, b, 2, 3);
		for(int x:b)
			System.out.print(x+" ");
		System.out.println();
		int x[][]= {{3,4,5},{6,7,8},{5,3,2}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] +" ");
			}
		System.out.println();
		}
		
		String names[]= {"java","oracle","python"};
		for( String n:names)
			System.out.println(n);
		
		Product products[]=new Product[5];  // array with userdefined - class
		products[0]=new Product(101,"bag",9839.00);
		products[1]=new Product(102,"box",9289.00);
		products[2]=new Product(103,"bin",9389.00);
		products[3]=new Product(104,"table",989.00);
		products[4]=new Product(105,"bag",7989.00);
		
		for(Product p:products)
			System.out.println(p);
		
		
	}

}
