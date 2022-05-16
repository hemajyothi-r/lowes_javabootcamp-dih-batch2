package com.labs.day1;

public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		
		int large;
		int temp;
		
		temp = a>b?a:b;
		large = c>temp?c:temp;
		System.out.println("The First number is " + a);
		System.out.println("The Second number is " + b);
		System.out.println("The Third number is " + c);
		System.out.println("The largest of the three numbers is " + large);		
		
		int number = 5;
        String output = (number % 2 == 0) ? "even" : "odd";
        System.out.println(output);
	}

}
