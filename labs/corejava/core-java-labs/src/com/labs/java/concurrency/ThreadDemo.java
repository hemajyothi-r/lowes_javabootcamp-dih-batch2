package com.labs.java.concurrency;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hellow Java!!");
		
		System.out.println(Thread.currentThread().getName());
	    Thread.currentThread().setName("default");
	    System.out.println(Thread.currentThread().getName());
		   
		System.out.println(Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(15);
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getState().name());
		
		System.out.println(Thread.currentThread().getStackTrace().toString());
		System.out.println(Thread.currentThread().isDaemon());
		
		
		
		
	}

}
