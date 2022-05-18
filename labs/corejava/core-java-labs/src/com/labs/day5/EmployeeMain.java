package com.labs.day5;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Employee object of type Employee \n");
		EmployeeChild employee = new EmployeeChild(100, "Hema", 35, "Female", "Senior Engineer", "IT", 50000.0);
		employee.printDetails();
		employee.appraise();

		// Creates Contractor Object of type Contractor
		System.out.println("Contractor object of type Contractor");
		ContractorChild contractor = new ContractorChild(200, "Jyothi", 25, "Female", 6, 50000);
		contractor.printDetails();

		// Create Employee object of type Person
		System.out.println("Employee object of type Person");
		PersonAbstract person1 = new EmployeeChild(100, "Hema", 35, "Female", "Senior Engineer", "IT", 50000);
		person1.printDetails(); // Employee's printDetails be called
		person1.sayHello();    // Person's sayHello method be called. Employee's sayHello method be hidden as it is static
		// Employee.sayHello();   // Employee's sayHello method be called
		// person.appraise(); // Not allowed as Person not aware of appraise method

		// Create Contractor object of type Person
		System.out.println("Contractor object of type Person");
		PersonAbstract person2 = new ContractorChild(200, "Hema", 25, "Female", 6, 50000);
		person2.printDetails(); // Contractor's printDetails be called

		// Create Employee object of type IAppriasable
		System.out.println("Employee object of type Appraisable");
		IAppraisable appraisable = new EmployeeChild(100, "Jyothi", 35, "Female", "Senior Engineer", "IT", 50000);
		// appraisable.printDetails(); // Not allowed as IAppraisable not aware of
		// printDetails method
		appraisable.appraise(); // Employee's appraise method be called
		
	}

}
