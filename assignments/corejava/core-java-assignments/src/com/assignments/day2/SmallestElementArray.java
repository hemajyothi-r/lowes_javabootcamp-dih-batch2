package com.assignments.day2;

//10) Java Program to print the smallest element in an array

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array 
        int [] arr = new int [] {1000, 2, 3, 204, 55, 6, 1007, 8, 900, 10};  
        
        int smallest = arr[0];
        
        System.out.println("The Smallest element of the given array: \n");
		
		for(int i = 0 ; i<arr.length; i++)
		{		
			if(smallest > arr[i]) 
				smallest = arr[i];
		}
		
		System.out.print(smallest);	
		
	}

}
