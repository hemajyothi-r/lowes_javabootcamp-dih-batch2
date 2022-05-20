package com.labs.day9;

class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException() {
		System.out.println("Insufficient Funds to withdraw, kindly check your balance");
	}
		
	public void InSuffucientFundsException(String message){
        System.out.println(message);
    }
}

class Bank{

	private int balance = 0;
	private int bankAcct = 123456678;
	
	public void deposit(int amount) {
		
		balance += amount;
		 System.out.println("Amount credited to the account is :" + amount);		   
	}
	
   public void withdraw(int amount) throws InsufficientFundsException {
	
	   if (amount > balance)
	   {
		   throw new InsufficientFundsException();
	   }
	   else
	   {
		   balance = balance - amount;
		   System.out.println("Amount withdrawn is :" + amount);		   
	   }
		   	   
	}
	
   public int getBalance(){
       return balance;
   }
   
   public int getBankAcct() {
	   return bankAcct;
   }
}

public class BankExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank objBank = new Bank();
		
		objBank.deposit(500);
		
		try {
			
			objBank.withdraw(1600);
		}
		catch (InsufficientFundsException ex)
		{
			System.out.println("You cannot withdraw money");
		}
				
	}

}
