package com.ust.threads;

public class ThreadDemo  extends Thread{
	
	public void run() {
		
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName());
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException{
		ThreadDemo t1=new ThreadDemo();
		t1.setName("Child1");
		t1.start();
		ThreadDemo t2=new ThreadDemo();
		t2.setName("Child2");
		t2.start();
		
		System.out.println(Thread.activeCount());
		for(int i=1;i<=5;i++) {
		Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		}
		t1.join();
		t2.join();
		
		System.out.println(Thread.activeCount());
	}

}
