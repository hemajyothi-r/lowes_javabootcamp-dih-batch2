package com.assignments.day2;

//9) Java Program to print the largest element in an array

public class LargestElementArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array 
        int [] arr = new int [] {1000, 2, 3, 204, 55, 6, 1007, 8, 900, 10};  
        
        int large=arr[0];
        
        System.out.println("The Largest element of the given array: \n");
		
		for(int i =0 ; i<arr.length; i++)
		{		
			if(large < arr[i]) 
				large = arr[i];
		}
		
		System.out.print(large);	
				
	}

}
