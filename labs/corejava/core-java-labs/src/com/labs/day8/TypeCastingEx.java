package com.labs.day8;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//implicit conversion
		int a=10;
		long b=a; //automatically converts the integer into long type
		
		float c= b ; // implicit /automatically converted
		
		
		//explicit conversion
		
		double x = 123.45;
		// long b = a;  /// throws error
		
		 long y = (long)x; //converting double into long tupe explicitly
		 
		 
	}

}
