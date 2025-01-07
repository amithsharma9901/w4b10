package com.ust.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	List<Customer> cList=new ArrayList<>();
	public void addCustomer( Customer customer) {
		cList.add(customer);
	}
	
	public void dispCustomers() {
		cList.forEach(c->System.out.println(c));
	}
	public void updateCustomer(Integer id,String name) {
		boolean result=false;
		for(Customer c:cList) {
			if(c.getId()==id) {
			    result=true;
				System.out.println("Found");
				c.setName(name);
			}
			}
		if(result==false)
			System.out.println("Not Found");
	}
	public void findCustomer(Integer id) {
		boolean result=false;
		for(Customer c:cList) {
			if(c.getId()==id) {
			    result=true;
				System.out.println("Found");
			}
			}
		if(result==false)
			System.out.println("Not Found");
	}

}
