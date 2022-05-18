package com.labs.day6;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compareTo() method return a positive number, negative number or 0
        // if s1 > s2 return positive number
        // if s1 < s2 return negative number
        // if s1==s2 return 0

        String s1 = "Hema";
        String s2 = "Hema";
        String s3 = "Jyothi";

        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); // -2 because H is 2 times lower then J
        System.out.println(s3.compareTo(s1));  // +2 because H is 2 times greater then J
	}

}
