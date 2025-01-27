package com.ust.components;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Integer id;
	String name;
	
	Student(){
		id=123;
		name="ram kumar ";
	}
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
