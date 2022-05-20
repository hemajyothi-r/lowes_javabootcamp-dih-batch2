package com.labs.day9;


/**
 * NullPointerException
 *
 * Throwable -> Exception -> RunTimeException -> NullPointerException
 * */


class Customer{
    public void display(){
        System.out.println("displaying...");
    }
}


public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str = "Mark";
	        System.out.println(str.length());

	        String str2 = null;
	        try{
	            System.out.println(str2.length());
	        }catch (NullPointerException ex){
	            System.out.println(ex.getMessage());
	        }

//	        Customer customer = new Customer();
//	        customer.display();
//
//	        Customer customer1 = null;
//	        customer1.display();
		
	}

}
