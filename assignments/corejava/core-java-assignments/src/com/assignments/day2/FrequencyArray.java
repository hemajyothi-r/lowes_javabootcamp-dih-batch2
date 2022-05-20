package com.assignments.day2;
//2) Java Program to find the frequency of each element in the array 

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array to find the frequency of each element
        int [] arr = new int [] {1, 2, 3, 8, 3, 2, 4, 2, 9, 8};  
        
        //Array freq will store frequencies of element  
        int [] freq = new int [arr.length];  
     
        
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
                freq[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
       
        System.out.println("Elements Frequency Summary: \n");  
        
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("Element " + arr[i] + " has appeared " + freq[i] + " times in the given Array");  
        }  
               
	}

}
