package com.labs.day9;

public class BasicExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } 
        catch (ArithmeticException ex) {
            System.out.println("Invalid number : '" + ex.getMessage() + "' exception occurred");
               
        }
        catch (Exception ex) {
            System.out.println("Generic Exception occurred");
            
        }
        
        System.out.println(c);

		
	}

}
