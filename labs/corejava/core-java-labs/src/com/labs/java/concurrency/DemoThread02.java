package com.labs.java.concurrency;

public class DemoThread02 implements Runnable{
	public void run(){
		System.out.println("Thread" + Thread.currentThread().getName());
		
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
