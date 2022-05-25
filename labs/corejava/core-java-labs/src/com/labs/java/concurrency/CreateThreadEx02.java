package com.labs.java.concurrency;

public class CreateThreadEx02 implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		
		//Approach #1
		DemoThread02 r1 = new DemoThread02();
		//r1.run();
		Thread t1 = new Thread(r1);
		t1.start();
		
		//Approach #2
		Thread t2 = new Thread(new DemoThread02());
		t2.start();
		
		//Approach #3
		Thread t3 = new Thread(new CreateThreadEx02());
		t3.setName("t3");
		
		t3.start();
		
		//Approach #4-----Anonymous interface approach
		Thread t4 = new Thread(new Runnable() {
		
			public void run() {			
				for(int i=0; i<100; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			}
		});
		
		t4.setName("t4");
		t4.start();
	}
	
	@Override
	public void run() {
						
			for(int i=0; i<100; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		
	}
}
