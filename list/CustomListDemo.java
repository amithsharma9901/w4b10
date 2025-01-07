package com.ust.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomListDemo {//main, client, test,run

	public static void main(String[] args) {
		System.out.println("====Menu====");
		System.out.println("1.AddCustomer");
		System.out.println("2.DisplayAllCustomers");
		//findCustomer-id- Found, Not Found
		//deleteCustomer -id -delete success, customer not exist
		//updateCustomer-id,name -change name, customer not exist
		int op=1;
		Scanner sc=new Scanner(System.in);
		
		CustomerService cs=new CustomerService();
		
		do {
			  switch(op) {
			  case 1:   { System.out.println("enter customer details(id,name)");
			              Customer c=new Customer();
			              c.setId(sc.nextInt());sc.nextLine();
			              c.setName(sc.nextLine());
				          cs.addCustomer(c);
				          break;
			  }
			  case 2: {
				             cs.dispCustomers();
				             break;
			         }
			  default: System.out.println(" Wrong Choice");
			  }
			  System.out.println("enter your choice(1..4)");
		      op=sc.nextInt();
			  }while(op<=4);
			
			System.out.println(" done ");
		}
		
		
		
		

	
}
