package com.assignments.day2;

import java.util.Scanner;

public class CalculatorApp {

	public static void showCalculatorMenu(){
	       
        System.out.println("\n1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Exit\n");
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Calculator App");
		 // create an object of Scanner class
	    Scanner input = new Scanner(System.in);
    	
    	
    	do {
    		showCalculatorMenu();
    		
    		char operator;
 		    Double number1, number2, result;
    		 
 		    
    		System.out.print("Select your Option : ");
    		int option = input.nextInt();

    		 // ask users to enter numbers
		    System.out.println("Enter first number");
		    number1 = input.nextDouble();

		    System.out.println("Enter second number");
		    number2 = input.nextDouble();
		       		
    		switch(option){
            	case 1:               
            		 result = number1 + number2;
     		         System.out.println("Addition result of "+  number1 + " and " + number2 + " = " + result);
    		        break;
            	case 2:
            		result = number1 - number2;
      		        System.out.println("Subtraction result of "+  number1 + " and " + number2 + " = " + result);
   		            break;
            	case 3:
            	    result = number1 * number2;
    		        System.out.println("Multiplication result of "+  number1 + " and " + number2 + " = " + result);
     		        break;

	            case 4:
	            	result = number1 / number2;
	 		        System.out.println("Division result of "+  number1 + " and " + number2 + " = " + result);
    		        break;

	            case 5:
	            	System.out.println("\nThank you for using Calculator App!!");
	                System.exit(0);
	                break;
	            	            	
	            default:
	                System.out.println("\nInvalid option!\n");
	                showCalculatorMenu();
    			}
       
    		}while(true);
		  }
	}

