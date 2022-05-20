package com.labs.day9;

public class StackOverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
            print1();
        }catch (StackOverflowError ex){
            System.out.println(ex.getMessage());
        }
	}

	 public static void print1(){
	        print2();
	    }

	    public static void print2(){
	        print1();
	    }
}
