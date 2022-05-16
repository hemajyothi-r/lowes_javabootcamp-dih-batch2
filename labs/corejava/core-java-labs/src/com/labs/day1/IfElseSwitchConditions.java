package com.labs.day1;

public class IfElseSwitchConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int age = 10;
		
//		if (age > 18) {
//			
//			System.out.println("Eligible Criteria");
//		}
//
//		else
//		{
//			
//			System.out.println("Not Eligible");
//			
//		}
		

		//without curly braces
		if (age > 18) 
			
			System.out.println("Eligible Criteria");
		else
					
			System.out.println("Not Eligible");
		
		
		
		int score = 60;
		if(score==90)
			System.out.println("Ä Grade");
		else if(score <90 && score > 70)
			System.out.println("B Grade");
		else if(score <70 && score > 50)
			System.out.println("C Grade");
		else 
			System.out.println("D Grade");
		
		
		
		String result = age >=18 ? "Ëligible" : "Not Eligible";
		System.out.println(result);
		
		int number = 4;
		
		switch(number) {
		
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
			default: 
				System.out.println("Not in the list");
			
		}	
	}

}
