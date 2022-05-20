package com.assignments.day2;

//5) Java Program to print the elements of an array

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation of array
		String[] strArray = {"Hema","Jyothi", "Ajeya", "Sammu", "Poorvi"};
		
		System.out.println("The elements of the given array are: \n");
		
		for(int i =0; i<strArray.length; i++)
		{
			System.out.print(strArray[i] +"\t");			
		}
		
	}

}
