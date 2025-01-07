package com.ust.collections.map;

import java.util.Scanner;

import com.ust.collections.list.Customer;
import com.ust.collections.list.CustomerService;

public class CourseMapDemo {

	public static void main(String[] args) {
		System.out.println("====Menu====");
		System.out.println("1.Add Course");
		System.out.println("2.DisplayAllCourses");
			int op=1;
		Scanner sc=new Scanner(System.in);
		
		CourseService cs=new CourseService();
		
		do {
			  switch(op) {
			  case 1:   { System.out.println("enter course details(id,name)");
			  Integer id=sc.nextInt(); sc.nextLine();
			  String name=sc.nextLine();
			             Course c=new Course(id,name);
			             
				          cs.addCourse(c);
				          break;
			  }
			  case 2: {
				             cs.listCourses();
				             break;
			         }
			  
			 
			  default: System.out.println(" Wrong Choice");
			  }
			  System.out.println("enter your choice(1..4)");
		      op=sc.nextInt();
			  }while(op<=4);
			
			System.out.println(" done ");
		}
		
		

	

}
