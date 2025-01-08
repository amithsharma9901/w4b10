package com.ust.collections.stackandqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> q=new ArrayBlockingQueue<Integer>(5);
		q.add(34);
		q.add(56);
		q.add(45);
		q.add(null);
		System.out.println(q);
		System.out.println(q.element());

	}

}
