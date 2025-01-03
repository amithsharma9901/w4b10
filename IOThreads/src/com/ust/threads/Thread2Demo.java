package com.ust.threads;

public class Thread2Demo implements Runnable {

	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName());
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Thread2Demo t=new Thread2Demo();
		Thread t1=new Thread(t);
		t1.start();
		//t1.suspend();
		//t1.resume();
		t1.setName("Student");

		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName());
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());
	}

}
