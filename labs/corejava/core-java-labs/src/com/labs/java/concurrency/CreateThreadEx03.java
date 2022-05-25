package com.labs.java.concurrency;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CreateThreadEx03 implements Callable<String> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		System.out.println("Thread Name: " + Thread.currentThread().getName());
		
		//Approach #1
		
		//Thread t1 = new Thread(c1);// errors out due to c1 being callable not runnable
		//creates 5 threads
		//ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//ExecutorService executor = Executors.newCachedThreadPool();
				
		ExecutorService executor = Executors.newWorkStealingPool();
		
		DemoThread03 c1 = new DemoThread03();
		
		Future<String> f1 = executor.submit(c1);
		
		System.out.println(f1.get());
	
		Future<String> f2 = executor.submit(c1);
		System.out.println(f2.get());
				
		Future<String> f3 = executor.submit(new CreateThreadEx03());
		System.out.println(f3.get());
		
		Future<String> f4 = executor.submit(new CreateThreadEx03());
		System.out.println(f4.get());
		
		Future<String> f5 = executor.submit(new Callable<String>() {
			public String call() throws Exception {
				
				for(int i=0; i<5; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
				return Thread.currentThread().getName()+ "Thread execution completed";
			}
		});
		
		System.out.println(f5.get());
				
	}

	@Override
	public String call() throws Exception {
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return Thread.currentThread().getName()+ "Thread execution completed";
	}
}
