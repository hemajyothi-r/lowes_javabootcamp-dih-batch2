package com.labs.day7;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3]; // declaration and instantiation
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		// a[3] = 40;  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
		}
		
	}

}
