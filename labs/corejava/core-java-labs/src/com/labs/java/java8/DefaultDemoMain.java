package com.labs.java.java8;

public class DefaultDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultDemo.staticPrint();
	
		DefaultDemoimpl obj1 = new DefaultDemoimpl();
		obj1.defaultPrint();
		
		System.out.println(DefaultDemo.msg);
		//DefaultDemo.msg ="Hello from main";	--throws error as its final variable

	}

}
