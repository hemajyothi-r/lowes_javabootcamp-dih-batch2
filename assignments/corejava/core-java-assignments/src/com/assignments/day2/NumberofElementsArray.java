package com.assignments.day2;

//11) Java Program to print the number of elements present in an array

public class NumberofElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int [] {1, 2, 3, 6, 7, 8, 9, 10};  
        
		int count =0;
		
        System.out.println("The number of elements of the given array are: \n");
		
		for(int i =0 ; i<arr.length; i++)
		{		
			count ++;
		}
		System.out.print(count);			
		
	}

}
