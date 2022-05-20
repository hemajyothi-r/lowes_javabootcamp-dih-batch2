package com.labs.day8;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] sourceArray = {'j', 'y', 'o', 't', 'h', 'i'};
		
		char[] destinationArray = new char[5];
		
		System.arraycopy(sourceArray, 0, destinationArray, 0, 5);
		
		System.out.println(String.valueOf( destinationArray));
	
		int arr[] = {1,2,3,4};
		System.out.println("Print Original Array");
		for (int i: arr) {
			System.out.println(i);
			
		}
		
		int cloneArray[] = arr.clone();
		
		System.out.println("Print Cloned Array");
		for (int i: cloneArray) {
			System.out.println(i);
			
		}
		
		System.out.println(arr == cloneArray); //false
				
		
	}

}
