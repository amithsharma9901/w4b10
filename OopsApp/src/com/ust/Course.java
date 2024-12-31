package com.ust;
public class Course{  //public protected default private
	public Integer id;  // instance variable, data members, state of the class
	  String name;
	protected Double fee;
	//constructor
	public Course(){  //inititalization
		id=101;
		name="java";
		fee=9999.99;
	}
	public Course(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Course(Integer id) {
		this.id = id;
	}
	public Course(Integer id, String name, Double fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	void show() {
		System.out.println("Oops concepts in parent");
	}
	void disp() {
		System.out.println(this.id +"  "+this.name+"  "+this.fee);
	}
	void getCourseDetails(Double discount) {
		System.out.println("After discount fee is  "+ (this.fee-discount));
	}
}