package com.labs.java.collection;

public class Employee {
	
	private int empId;
	private String name;
	private int  age;
	private String designation;
	private String department;
	private String country;
	
	// default constructor
	public Employee() {
		 
		this(101, "Hema", 24, "Developer", "IT", "India");
		//this(102, "Jyothi", 26, "Tester","CO", "USA");
		//this(103, "Ajeya", 20, "DevOps Engineer","Admin", "UK");
		//this(104, "Sammu", 27, "System Engineer","CO",  "Australia");
	}
	
	@Override
	public String toString() {
		return "\n" + empId + "\t" + name + "\t" + age + "\t" + designation + "\t" + department + "\t" + country  ;
			
	}
	
	public Employee(int empId, String name, int age, String designation, String department, String country) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.department = department;
		this.country = country;
	}
		
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int id) {
		this.empId = id;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	
	public static String[ ] strEmployeeHeader = {"EmpID", "Name","Age", "Designation", "Department", "Country"}; // One dimensional array.	
	
	public static void printEmpHeader() {

		 for (int i =0; i<strEmployeeHeader.length;i++){
			   System.out.print(strEmployeeHeader[i] + "\t");
			  }
	}
}