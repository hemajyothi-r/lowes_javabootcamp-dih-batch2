package com.labs.day8;

public class ArrayPrintEx {

	static int[] get(){
		
		return new int[] {10, 20, 30, 40};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = get();
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
