package com.labs.java.collection;

import java.util.Arrays;

public class ArrayClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] test = new int[3];
		test[0]=10;
		test[1]=20;
		test[2]=30;
		
		for(int i:test) {
			System.out.println(i);
		}
		
		int[] test1 = 	Arrays.copyOf(test, 2);
		for(int i:test1) {
			System.out.println(i);
		}
		
		
	}

}
