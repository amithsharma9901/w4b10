package com.training.designpatterns;


class Single{
	
	public static Single s=null;
	
	private Single() {
		
	}
	public static Single getInstance() {
		if(s==null) {
			s=new Single();
		}
		return s;
	}
	
}
public class SingletonDemo {
	
	
	
	public static void main(String[] args) {
		
		Single s= Single.getInstance() ; //new Single();
		System.out.println(s.hashCode());
		Single s1= Single.getInstance() ; //new Single();
		
		System.out.println(s1.hashCode());
		Single s2= Single.getInstance() ; //new Single();
		
		System.out.println(s2.hashCode());
		
		
	}

}
