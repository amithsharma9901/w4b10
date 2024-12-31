package com.ust.oops;

import com.ust.Course;

public class Demo extends Course {  //public , protected 

	
	public static void main(String[] args) {
		
     Demo d=new Demo();
     System.out.println(d.id+"  "+d.fee);
     Course c=new Course();
     System.out.println(c.id);
     
     Person p=new Person();
     p.setId(101);
     p.setName("Raj");
     System.out.println(p.getId()+"  "+p.getName());
	}

}
