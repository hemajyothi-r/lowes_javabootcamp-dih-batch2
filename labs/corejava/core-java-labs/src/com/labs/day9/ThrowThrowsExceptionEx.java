package com.labs.day9;

public class ThrowThrowsExceptionEx {

	 public static void main(String[] args) {
	        try {
	            doSomething();
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Exception throw n throws example: ");
	        }
	    }

	    public static void doSomething() throws Exception {
	        doSomethingElse();
	    }

	    public static void doSomethingElse() throws Exception {
	        doSomethingSomethingElse();
	    }

	    public static void doSomethingSomethingElse() throws Exception {
	        //throw new Exception();
	    }

}
