package com.ust.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student implements InitializingBean,DisposableBean{
	
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
  public void afterPropertiesSet() {
	  System.out.println("bean initialized");
	  
  }
  public void destroy() {
	  System.out.println("bean destroyed");
  }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
