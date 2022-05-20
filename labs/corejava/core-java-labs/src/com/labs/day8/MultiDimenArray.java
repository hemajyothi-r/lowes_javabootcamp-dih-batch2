package com.labs.day8;

public class MultiDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,2,3},{10,20,30},{5, 10, 15}};
		
		//printing multi array with known length of array
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} 
		
		System.out.println();
		
		// for unknown length of array use array.length
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} 
		
	}

}
