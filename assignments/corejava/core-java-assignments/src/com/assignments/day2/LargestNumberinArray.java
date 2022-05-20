package com.assignments.day2;

import java.util.Arrays;

//18) Find Largest Number in an Array

public class LargestNumberinArray {

	public static int getLargest(int[] a, int total){  
		
//		// Using temp variable
//		int temp;  
//		for (int i = 0; i < total; i++)   
//		        {  
//		            for (int j = i + 1; j < total; j++)   
//		            {  
//		                if (a[i] > a[j])   
//		                {  
//		                    temp = a[i];  
//		                    a[i] = a[j];  
//		                    a[j] = temp;  
//		                }  
//		            }  
//		        }  
//		       return a[total-1]; 
//		       
		//Using Arrays.sort method
		Arrays.sort(a);  
		return a[total-1];  
						
		}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Largest Number in the array is : "+getLargest(a,6));  
		System.out.println("Largest Number in the array is : "+getLargest(b,7));  
	}

}
