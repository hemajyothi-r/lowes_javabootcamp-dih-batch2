package com.assignments.day2;

//4) Java Program to print the duplicate elements of an array

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array   
        int [] arr = new int [] {1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2};     
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                	
                    System.out.println(arr[j]);  
            }  
        }  
	}

}
