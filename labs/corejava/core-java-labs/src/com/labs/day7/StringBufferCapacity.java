package com.labs.day7;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      StringBuffer sb2 = new StringBuffer();
      System.out.println(sb2.capacity()); // 16
      sb2.append("Hello");
      System.out.println(sb2.capacity()); // 16
      sb2.append("Welcome to java class");
      System.out.println(sb2.capacity()); //34
      
      /*
       * (Old capacity *2) + 2
       * 
       * Default capacity =16
       * 
       * 16 + 16 + 2 = 34
       * 
       * */
                 
	}

}
