package com.assignments.day2;

//7) Java Program to print the elements of an array present on even position

public class EvenElementsPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
        
        System.out.println("The elements present on Even position of the given array: \n");
		
		for(int i =1 ; i<arr.length; i= i + 2)
		{		
			System.out.print(arr[i] +"\t");			
		}
        
		
	}

}
