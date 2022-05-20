package com.assignments.day2;

//1) Java Program to copy all elements of one array into another array

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1: Copy array using assignment operator
	    String[] sourceArray = {"Hema","Jyothi", "Ajeya", "Sammu"};      
	    String[] destinationArray = sourceArray;
	    
	    System.out.println("Scenario 1: ");
	    System.out.print("Source Names Array: ");
	    printArray(sourceArray);
	    System.out.print("Destination Names Array: ");
	    printArray(destinationArray);

	    //Scenario 2: Copy array by iterating
	    String[] srcArr = {"BMW","Mercedes", "Mini", "Mahindra"}; 
	    String[] destArr = new String[srcArr.length];
	    for (int i = 0; i < destArr.length; i++) {
	    	destArr[i] = srcArr[i];
	    }

	    System.out.println("Scenario 2: ");
	    System.out.print("Source Car Array c: ");
	    printArray(srcArr);
	    System.out.print("Destination Car Array: ");
	    printArray(destArr);

	    
	    //Scenario 3: Copy array using clone
	    String[] srArr = {"Jawa", "C#", "Python", "VB"};      
	    String[] desArr = srArr.clone();

	    System.out.println("Scenario 3: ");
	    System.out.print("Source Languages Array : ");
	    printArray(srArr);
	    System.out.print("Destination Languages Array : ");
	    printArray(desArr);

	    
	    //Scenario 4: Copy array using arraycopy
	    String[] sArray = {"Corona Virus", "Covid-19", "Pandemic", "China Virus"};      
	    String[] dArray = new String[sArray.length];
	    System.arraycopy(sArray, 0, dArray, 0, dArray.length);

	    System.out.println("Scenario 4: ");
	    System.out.print("Source Corona Array : ");
	    printArray(sArray);
	    System.out.print("Destination Corona Array : ");
	    printArray(dArray);    
	 }
	
	public static void printArray(String[] arr) {
		System.out.print("[ ");
	    for (int i = 0; i < arr.length; i++) {
	       System.out.print(arr[i] + " ");
	    }
	    System.out.println("]");
	}
}
