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

}
