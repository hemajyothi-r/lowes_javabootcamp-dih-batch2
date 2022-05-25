package com.labs.java.concurrency;

public class CreateThreadEx01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Thread Name: " + Thread.currentThread().getName());
		DemoThread01 t1 = new DemoThread01();
		t1.setName("T1");
		t1.setPriority(10);
		t1.start(); //runnable
		t1.join();  // wait till thread to die
		
		
		DemoThread01 t2 = new DemoThread01();
		t2.setName("T2");
		t1.setPriority(5);
		t2.start(); //runnable
		//t2.join();
		
		DemoThread01 t3 = new DemoThread01();
		t3.setName("T3");
		t3.setPriority(1);
		t3.start(); //runnable
		//t3.join();
		
		System.out.println("Exiting from the main");
		
		
	}

}
