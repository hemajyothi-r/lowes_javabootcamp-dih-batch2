package com.labs.java.concurrency;

public class DemoThread01 extends Thread{
	public void run(){
		System.out.println("Thread.currentThread().getName()");
		
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
