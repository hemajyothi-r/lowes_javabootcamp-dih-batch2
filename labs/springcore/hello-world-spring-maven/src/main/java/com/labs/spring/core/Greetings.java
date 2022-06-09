package com.labs.spring.core;

public class Greetings {
	String message = "Welcome to Spring Learning!!";

	public Greetings() {

	}

	public Greetings(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		// System.out.println("Welcome to Spring");
		return message;
	}

	public void setMessage(String message) {

		this.message = message;

	}
}
