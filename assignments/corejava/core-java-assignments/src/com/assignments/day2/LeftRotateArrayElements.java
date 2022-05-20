package com.assignments.day2;

import java.util.Scanner;

//3) Java Program to left rotate the elements of an array 

public class LeftRotateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		//Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        
        //n determine the number of times an array should be rotated  
       
        System.out.print("\nEnter the number of times an array to be rotated : ");
		int n = scan.nextInt();

        //Display original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
       
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
           
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
        
        System.out.println();  
        
        //Displays resulting array after rotation  
        System.out.println("Array after " + n + " Left rotations: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
		
	}

}
