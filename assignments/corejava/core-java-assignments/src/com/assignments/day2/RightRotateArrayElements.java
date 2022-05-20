package com.assignments.day2;

import java.util.Scanner;

//13) Java Program to right rotate the elements of an array

public class RightRotateArrayElements {

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
       
        //Rotate the given array by n times toward right  
        for(int i = 0; i < n; i++){  
            int j, last;  
            //Stores the first element of the array  
            last = arr[arr.length -1];  
            
            for(j = arr.length-1; j > 0; j--){  
                //Shift element of array by one  
                arr[j] = arr[j-1];  
            }  
           
            //First element of array will be added to the start  
            arr[j] = last;  
        }  
        
        System.out.println();  
        
        //Displays resulting array after rotation  
        System.out.println("Array after " + n + " Right rotations: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  

	}

}
