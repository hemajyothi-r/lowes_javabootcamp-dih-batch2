package com.labs.day8;

//passing array as an argument

// create an array with some numbers and find the min number
public class ArrayAsArgs {

	static void minNumber(int arrayName[]) {
		int min = arrayName[0];
		for (int i=1; i<arrayName.length;i++) {
			if(min >arrayName[i]) {
				min = arrayName[i];
			}
		}
		
		System.out.println(min);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7, 3, 1, 9, 0, -4};
		minNumber(a);
		
	}

}
