package com.labs.java.java8;

public class DefaultDemoimpl implements DefaultDemo {

	@Override
	public int print() {
		// TODO Auto-generated method stub
		return 0;
	}

//	public void defaultPrint() {
//		System.out.println("Default method inside Child");
//	}
	static void staticPrint() {
		System.out.println("Static method inside the Child");
	}
	
	public void privatePrint() {
		System.out.println("Private method inside the child");
	}
	
}

