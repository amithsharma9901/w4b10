package com.ust;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.components.Customer;
import com.ust.components.Student;
import com.ust.config.SpringConfig;
import com.ust.config.SpringConfig1;
public class App 
{
    public static void main( String[] args )
    {
     //  Engine e=new Engine();
    //   System.out.println(e);
    //   e.milage();
    	
    	// xml config
    //    ApplicationContext context = new 
    //    FileSystemXmlApplicationContext("C:\\javaworkspace\\UST\\SpringApp1\\beans.xml");
    //    Engine e1=(Engine)context.getBean("e");
    //    e1.milage();
       
    	 
    	//@Bean   - java config
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       Customer cust= (Customer)context.getBean(Customer.class);
       System.out.println(cust);
       
       Engine e1=(Engine)context.getBean(Engine.class);
       e1.milage();
       
       //Component csan   - java config 
       AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
       Student s=(Student)context1.getBean(Student.class);
       System.out.println(s);
       
    }
}
