package com.ust.oops;

import java.util.Date;

//java.lang.Object
// equals(), hashCode()
//getClass()
//toString
//finalize()
//wait(), notify(),notifyAll()
//clone

class Employee1 implements Cloneable{
	Integer id;
	String name;
	Employee1(){
		id=101;
		name="ram";
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	public void finalize(){
		id=null;
		name=null;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@SuppressWarnings("unchecked")
	void show() {
		System.out.println(new Date().getDay());
	}
	
}
public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException{
		String s=new String("java");
		System.out.println(s.getClass());
		Person p=new Person();
		Person p1=new Person();
		Person p2=p;
		System.out.println(p.getClass());
		System.out.println(p.equals(p1));
		System.out.println(p2.equals(p));
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.hashCode());
		Employee1 e=new Employee1();
		System.out.println("Before cloning:"+e);
		Employee1 e1=(Employee1)e.clone();//prototyping
		System.out.println("after cloneing:"+e1);
		e.show();
		
	}

}
