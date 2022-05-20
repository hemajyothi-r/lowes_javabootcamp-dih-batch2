package com.labs.day9;

import java.io.IOException;

class Test{

    public void test() throws ArithmeticException, NullPointerException, IOException {

    }

}

public class ExceptionCustomImplEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Test t = new Test();
			t.test();
		}
		catch (ArithmeticException e) {
			
		}
		catch (NullPointerException e) {
			
		}
		catch (IOException e) {
			
		}
		
		
		
		    int a  =10;
	        int b = 20;
	        int c = 0;

	        try{
	            c = a / b;
	        }catch (ArithmeticException ex){

	        }catch (NullPointerException | NumberFormatException e){

	        }
	        catch (Exception ex){

	        }
		
	}

}
