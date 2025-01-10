package com.ust.collections.seachsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Account implements Comparable{
	Integer id;
	String name;
	Double balance;
	
	
	public Account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public int compareTo(Object o) {
		Account account=(Account)o;
		//id
		/*
		if(this.id>account.id)
			return 1;
		else if( this.id<account.id)
			return -1;
		else
			return 0;
			*/
		//balance
		/*   
		if(this.balance>account.balance)
			return 1;
		else if (this.balance <account.balance) 
			return -1;
		else 
			return 0;
			*/
		//name
		return this.name.compareTo(account.name);// 1 -1 0
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}


public class SortDemo {

	public static void main(String[] args) {
		Integer a[]= {9,6,4,8,2,3,1};
		Arrays.sort(a);
		System.out.println(a);
		for(Integer x: a)
			System.out.println(x);
		System.out.println("===for each ========with lamda");
		Arrays.asList(a).forEach(a1->System.out.println(a1));
		
		
		List<Integer> list=Arrays.asList(2,3,1,4,5,6,2,3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		List<Account> accountList=Arrays.asList(new Account(243,"ram",69878.98),
				new Account(453,"kiran",19878.98),
				new Account(143,"raj",69878.98),
				new Account(843,"ramesh",59878.98),
				new Account(523,"arvind",29878.98));
		accountList.forEach(a2->System.out.println(a2));
		Collections.sort(accountList);
		accountList.forEach(a2->System.out.println(a2));
				
	}

}
