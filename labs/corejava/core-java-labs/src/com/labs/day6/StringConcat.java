package com.labs.day6;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Hello" + "World";
	        System.out.println(str); // HelloWorld

	        String str2 = 10 + 20 + 30 + "Sum" + 40 + 50 + true;
	        System.out.println(str2);  //60Sum4050
	        
	        String s1 = "Hello";
	        String s2 = "World";
	        String s3 = s1.concat(s2);
	        System.out.println(s3); //HelloWorld
	        
	}

}
