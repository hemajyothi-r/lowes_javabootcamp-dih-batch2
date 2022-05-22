package com.lowes.empapp.exception;

public class EmployeeException extends Exception{

	public EmployeeException() {
		System.out.println("Employee App exception occurred");
	}
	
	public EmployeeException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("Enter Interger value");
	}

	public void EmployeeNullPointerException() {
		
		System.out.println("Null Pointer Exception Occurred");
	}
	
	public void EmployeeArrayIndexOutOfBoundsException() {
		System.out.println("Array out of bound has Exception Occurred");			
	}
	public void EmployeeInputMismatchException() {
		System.out.println("Input data type is mismatched");	
	}
	
		
}
