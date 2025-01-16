package com.training.designpatterns;

class Prototype implements Cloneable{
	
	Prototype(){
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
}

public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException{
		Prototype p1= new Prototype();
		Prototype p2=(Prototype)p1.clone();
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
	}

}
