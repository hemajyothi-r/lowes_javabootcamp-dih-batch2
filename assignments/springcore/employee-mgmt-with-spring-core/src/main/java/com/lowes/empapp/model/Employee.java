package com.lowes.empapp.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId;
	private String name;
	private int  age;
	private String designation;
	private String department;
	private String country;
	private LocalDate doj;
	   
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;
	
	// default constructor
	public Employee() {
		 
		//this(101, "Hema", 24, "Developer", "IT", "India", "28/05/2022");
		//this(102, "Jyothi", 26, "Tester","CO", "USA");
		//this(103, "Ajeya", 20, "DevOps Engineer","Admin", "UK");
		//this(104, "Sammu", 27, "System Engineer","CO",  "Australia");
	}
	
	@Override
	public String toString() {
		return empId + "\t" + name + "\t" + age + "\t" + designation + "\t" + department + "\t" + country +  "\t" + doj ;
			
	}
	
	public Employee(int empId, String name, int age, String designation, String department, String country, LocalDate doj2) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.department = department;
		this.country = country;
		this.doj = doj2;
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
	
	public void setAge(String age) {
		this.age = Integer.parseInt(age);  
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
	public static String[ ] strEmployeeHeader = {"EmpID", "Name","Age", "Designation", "Department", "Country" , "Date of Joining"}; // One dimensional array.	
	
	public static void printEmpHeader() {

		 for (int i =0; i<strEmployeeHeader.length;i++){
			   System.out.print(strEmployeeHeader[i] + "\t");
			  }
		 System.out.println("\n");
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		
		this.doj = doj;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}