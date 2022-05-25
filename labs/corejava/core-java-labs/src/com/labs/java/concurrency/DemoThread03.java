package com.labs.java.concurrency;

import java.util.concurrent.Callable;

/****
 * 
 * Creating thread by implementing callable interface
 *
 */

public class DemoThread03 implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return Thread.currentThread().getName()+ "Thread execution completed";
	}

}
