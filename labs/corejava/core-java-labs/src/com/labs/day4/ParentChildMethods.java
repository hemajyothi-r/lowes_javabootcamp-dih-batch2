package com.labs.day4;


class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }
    
    public Parent(int a) {
    	System.out.println("Parent constructor with parameter");
    }

    public void test1(){
        System.out.println("Parent - method");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }

    public Child(int a){
        System.out.println("Child constructor with parameter");
    }
    
    public void test2(){
        System.out.println("Child - method");
    }
}

public class ParentChildMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Parent parent = new Parent();
      Child child = new Child();
      Child child1 = new Child(100);
      child.test1();
      child.test2();
     
      
//      Parent parent = new Parent();
//      parent.test1();

      
      
	}

}
