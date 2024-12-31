package com.ust.oops;

class Employee{
	Integer id;
	String name;
	Department department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}

class Department{
	String dname;
	String location;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}

public class CompositionDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee();  //main
		Department d=new Department();  //part
		d.setDname("IT");
		d.setLocation("Hyderabad");
		e.setId(101);
		e.setName("Raj");
		e.setDepartment(d);
		

	}

}
