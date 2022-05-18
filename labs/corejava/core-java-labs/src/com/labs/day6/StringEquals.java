package com.labs.day6;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // equal() method compares the two given strings based on the content of the string
        // if any character is not matched it returns false
        // if all character are matched it return true
        String s1 = "Hema";
        String s2 = "Hema";
        String s3 = new String("Hema");
        String s4 = "Jyothi";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false

        String s5 = "HEMA";
        System.out.println(s1.equals(s5)); // false
        System.out.println(s1.equalsIgnoreCase(s5));  // true
        
        
        String a1 = "Hema";
        String a2 = "Hema";
        String a3 = new String("Hema");

        System.out.println(a1 == a2); // true because both refers to the same instance
        System.out.println(a1 == a3); // false because a3 refers to instance created in normal heap
        
	}

}
