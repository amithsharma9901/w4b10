package com.ust;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
    	FileSystemXmlApplicationContext context2 = new 
        FileSystemXmlApplicationContext("C:\\javaworkspace\\UST\\SpringApp1\\beans.xml");
        Engine e1=(Engine)context2.getBean("e");
        e1.milage();
        Engine ee2=(Engine)context2.getBean("e");
        ee2.milage();
        System.out.println(e1.hashCode()+"  "+ee2.hashCode());
        context2.close();
       
    	 
    	//@Bean   - java config
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       Customer cust= (Customer)context.getBean(Customer.class);
       System.out.println(cust);
       
       Engine e2=(Engine)context.getBean(Engine.class);
       e2.milage();
       
       //Component csan   - java config 
       AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
       Student s=(Student)context1.getBean(Student.class);
       System.out.println(s+"  "+s.hashCode());
       Student s1=(Student)context1.getBean(Student.class);
       System.out.println(s1+"  "+s1.hashCode());
       context1.close();
       
    }
}
