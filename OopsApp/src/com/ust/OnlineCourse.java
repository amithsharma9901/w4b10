package com.ust;

public class OnlineCourse  extends Course{
	String type;
	Integer duration;
	OnlineCourse(){
		super();
		type="it";
		duration=3;
	}
	void childDisp() {
		System.out.println("Display of Online course details...");
		System.out.println(type+"  "+duration +id +" "+name+"  "+fee); //public, protected,default
		System.out.println(super.name+"  "+super.id);
		this.show();
		super.show();
	}
	void show() {
		System.out.println("Child class");
	}
}