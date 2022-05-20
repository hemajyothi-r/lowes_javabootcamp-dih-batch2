package com.assignments.day2;

//6) Java Program to print the elements of an array in reverse order


public class ReverseArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation of array
		String[] strArray = {"Hema","Jyothi", "Ajeya", "Sammu", "Poorvi"};
				
		System.out.println("The elements of the given array in the Reverse order: \n");
				
		for(int i =strArray.length-1 ; i>=0; i--)
		{
			System.out.print(strArray[i] +"\t");			
		}
				
	}

}
