package com.ust.threads;

class CallMe {
	
	public  synchronized  void call(String s) {
		try {
			System.out.println(" [Welcome");
			System.out.println( "Mrs/Mr/Miss"+s);
			Thread.sleep(1000);
			System.out.println(" Bye ]");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


public class SyncDemo extends Thread {
	CallMe c;
	String s;
	SyncDemo(CallMe c,String s){
		this.c=c;
		this.s=s;
		this.start();
	}
	
	public void run() {
		c.call(this.s);
	}

	public static void main(String[] args) {
		CallMe cm=new CallMe();
		SyncDemo s1=new SyncDemo(cm,"UstUser1");
		SyncDemo s2=new SyncDemo(cm,"UstUser2");
		SyncDemo s3=new SyncDemo(cm,"UstUser3");

	}

}
