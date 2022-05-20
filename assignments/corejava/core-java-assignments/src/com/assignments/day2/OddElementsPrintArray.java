package com.assignments.day2;

//8) Java Program to print the elements of an array present on odd position

public class OddElementsPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize array 
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
        
        System.out.println("The elements presnet on Odd position of the given array: \n");
		
		for(int i =0 ; i<arr.length; i++)
		{		
			if (i%2==0)
			System.out.print(arr[i] +"\t");			
		}
        

	}

}
