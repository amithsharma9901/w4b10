package com.ust.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
	
		ExecutorService es= Executors.newFixedThreadPool(10);
		Runnable task1= ()->{
			System.out.println("Thread1: task1");
		};
		Runnable task2= ()->{
			System.out.println("Thread2: task2");
		};
		es.submit(task1);
		es.submit(task2);
		es.shutdown();

	}

}
