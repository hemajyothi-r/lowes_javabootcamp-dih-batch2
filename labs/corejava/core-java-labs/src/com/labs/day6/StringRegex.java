package com.labs.day6;

import java.util.Arrays;

public class StringRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message =  "hema.jyothi@gmail.com";
        // 91-999999
       //String message = "Hello, Welcome to Java";
        String[] result = message.split("@");
        System.out.println(Arrays.toString(result));
	}

}
