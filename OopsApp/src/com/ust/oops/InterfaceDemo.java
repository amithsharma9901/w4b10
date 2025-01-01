package com.ust.oops;
interface Vehicle{
	int speed();
	void milage();
	static void show() {
		System.out.println(" interface static method");
	}
	default void disp() {
		System.out.println(" default java8 new method..");
	}
}
interface Loan{
	int getEmi();
}
class Car implements Vehicle,Loan{
	public int speed() {
		return 1;
	}
	public void milage() {
		
	}
	public int getEmi() {
		return 2;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
	
		Vehicle v=new Car();
		v.milage();
		System.out.println(v.speed());
		Loan l=new Car();
		System.out.println(l.getEmi());

	}

}
