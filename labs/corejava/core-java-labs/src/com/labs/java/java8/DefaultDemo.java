package com.labs.java.java8;

public interface DefaultDemo {

	public static final String msg="Hello interface variable";
	//private String msg1="Check private variable";  -- throws error as only public, static, final variables
	
	int print();
	//java 8
	default void defaultPrint() {
		System.out.println("Default method inside interface");
		privatePrint();
	}
	
	//java 8	
	static void staticPrint() {
		System.out.println("Static method inside the interface");
	}
	
	//java 9
	private void privatePrint() {
		System.out.println("Private method inside the interface");
	}
	
}
