package com.ust.components;

public class Customer {
	
	Integer id;
	String name;
	public Customer() {
		id=101;
		name="ram";
		
	}
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	

}
