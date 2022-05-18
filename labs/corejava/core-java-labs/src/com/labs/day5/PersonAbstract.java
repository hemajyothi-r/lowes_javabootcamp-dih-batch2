package com.labs.day5;

public abstract class PersonAbstract {
	
	private String name;
	private int age;
	private String gender;
	
	public PersonAbstract()
	{
		System.out.println("Person class default constructor");
	}
	
	public PersonAbstract(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	protected void printDetails() {
		System.out.println("Print person details");		
	}
	
	protected void printDetails(boolean dontPrintAge) {
		System.out.println("Print Person details without age");
	}	
	
	public static void sayHello() {
		System.out.println("Hello Person");
	}

	

}