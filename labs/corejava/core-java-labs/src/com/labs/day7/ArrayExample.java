package com.labs.day7;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5, 6,7} ;  //declaration, instantiation and intialization
		
//		//for loop
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//			
//		}
		
		// for each loop syntax
		for(int number : a){
			
			System.out.println(number);
		}
	}

}
