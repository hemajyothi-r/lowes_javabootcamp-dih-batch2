package com.lowes.empapp.exception;

public class EmployeeException extends Exception{

	public EmployeeException() {
		System.out.println("Employee App exception occurred");
	}
	
	public EmployeeException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("This employee does not exist!");
	}
		
}
