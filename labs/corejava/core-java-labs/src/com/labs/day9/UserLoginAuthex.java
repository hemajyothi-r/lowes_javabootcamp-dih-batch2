package com.labs.day9;

class UserAlreadyLoggedInException extends Exception{

	public UserAlreadyLoggedInException ()
	{
		System.out.println("You already logged in");
	}
}

class Authentication {

    private boolean isloggedIn = false;

    public void login(String email, String password) throws UserAlreadyLoggedInException {
        if (!isloggedIn) {
            if (email.equals("hema") && password.equals("1234")) {
                isloggedIn = true;
                System.out.println("login successful!!");
            } else {
                System.out.println("login failed!, try again");
            }
        } else {
            throw new UserAlreadyLoggedInException();
        }
    }

}

public class UserLoginAuthex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Authentication auth = new Authentication();
	     try {
	            auth.login("hema", "1234");
	        } catch (UserAlreadyLoggedInException e) {
	           // e.printStackTrace();
	        	
	        }
	     
	     try {
	            auth.login("hema", "1234");
	        } catch (UserAlreadyLoggedInException e) {
	           // System.out.println("You already logged in");
	        	e.getMessage();
	        }
	        
	}

}
