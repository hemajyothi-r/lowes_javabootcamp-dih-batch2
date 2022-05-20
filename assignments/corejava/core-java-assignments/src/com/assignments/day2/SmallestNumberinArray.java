package com.assignments.day2;
//20) Find Smallest Number in an Array 

import java.util.Arrays;

public class SmallestNumberinArray {

	public static int getSmallest(int[] a, int total){ 
//		//using Temp variable
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
//		       return a[1];//2nd element because index starts from 0  
		       
		       //using Arrays.sort method 
		       Arrays.sort(a);
		       return a[1];  
		}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int a[]={1,2,5,6,3,2};  
				int b[]={44,66,99,77,33,22,55};  
				System.out.println("Smallest Number in the array : "+getSmallest(a,6));  
				System.out.println("Smallest Number in the array : "+getSmallest(b,7));  
				
			
	}

}
