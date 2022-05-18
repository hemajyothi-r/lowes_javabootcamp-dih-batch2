package com.labs.day6;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "Welcome to Lowe's java training";
        System.out.println(message.substring(0, 7));  // Welcome

        System.out.println("Original message: "+ message);
        System.out.println("SubString starting from index 7: "+ message.substring(7));
        System.out.println("SubString starting from index  0 to 7: "+ message.substring(0, 7));
	        
        String str = new String("Welcome home");

	    System.out.println(str);
	    System.out.println(str.substring(8));

	}

}
