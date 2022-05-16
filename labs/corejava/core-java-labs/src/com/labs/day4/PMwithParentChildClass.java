package com.labs.day4;

class Parent2{
    public void greeting(String name){
        System.out.println("Welcome "+ name);
    }
}

class Child2 extends Parent2{
    public void greeting(String name){
        System.out.println("Hello "+ name);
    }
}


public class PMwithParentChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Child2 child = new Child2();
	        child.greeting("Samruddhi");
	        
	}

}
