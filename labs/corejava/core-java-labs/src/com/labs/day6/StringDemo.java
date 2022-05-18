package com.labs.day6;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";  //creating string using string literal
		char[] ch= {'H', 'e', 'l', 'l','o'};
		
		 String s2 = new String(ch);  // converting char array to string
	     String s3 = new String("World"); // creating java string by using new keyword
	
	     System.out.println(s1);
	     System.out.println(s2);
	     System.out.println(s3);
	     
	     
	     String str = "Hello";
	     str.concat("World"); // we are using concat() method to append the string at the end
	     System.out.println(str);  // will print hello only bcoz strings are immutable object

	     String str1 = "Hello";
	     str1 = str1.concat("world");
	     System.out.println(str1);
	        
	        
	
	}

}
