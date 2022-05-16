package com.labs.day3;

class Calculator2 {
    // non static method
    public void addNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    // static method
    public static void subNumber(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}



class A10{
    static int a;
//static block example
    static {
       a = 20;
        System.out.println(a);
    }

    public void test(){
        a = 15;
        System.out.println(a);
    }

}


public class StaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calculator2 cal = new Calculator2();
	        cal.addNumber(100, 50);
	        Calculator2.subNumber(100, 50);
	 
	        
	        A10 a1 = new A10();
	        a1.test();
	}

}
