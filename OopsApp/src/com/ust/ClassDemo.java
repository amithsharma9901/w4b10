package com.ust;

public class ClassDemo {  //client , run , test , main
	public static void main(String[] args) {
		Course c=new Course();  // JVM id=0,name=null,fee=0.0
		c.show();
		c.disp();
		System.out.println(c.id+"  "+c.name+"  "+c.fee);
		Course c1=new Course(102,"python");  
		c1.show();
		System.out.println(c1.id+"  "+c1.name+"  "+c1.fee);
		c1.disp();
		
		
		OnlineCourse oc=new OnlineCourse();
		oc.disp();
		oc.childDisp();
		
		//c=null;
		//c1=null;
		//System.gc(); - GC	
	}
}
