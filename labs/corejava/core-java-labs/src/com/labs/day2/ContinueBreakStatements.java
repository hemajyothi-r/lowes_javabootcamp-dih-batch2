package com.labs.day2;

public class ContinueBreakStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using break statement Jump Statement
		      System.out.println("start");

		      for(int i=0; i<10; i++)
		      {
		          if(i==5)
		          {
		            break;
		              }
		          System.out.println(i);
		      }
		      System.out.println("end");


		// using Continue statement Jump Statement

		      System.out.println("start");

		      for(int i=0; i<10; i++)
		      {
		          if(i==5) continue;
		         System.out.println(i);
		      }
		      System.out.println("end");
					
	}

}
