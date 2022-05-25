package com.lowes.empapp;

import com.lowes.empapp.model.*;
import com.lowes.empapp.exception.*;
import com.lowes.empapp.service.*;

import java.util.Scanner;
import java.io.*;

public class EmployeeManagementMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Management App");
		EmployeeService empService = new EmployeeServiceArrImpl(10);

		int empId, age;
		String name, designation, department, country;

		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee();

		do {

			showEmployeeMainMenu();
			int option = 0;
			System.out.print("\nEnter your Option : ");
			try {
				option = scan.nextInt();

			} catch (NumberFormatException e) {

				System.out.print("\nInvalid number, please enter correct option. ");
				continue;
			}
			try {
				switch (option) {
				case 1: // Create/Add Employee

					emp1 = new Employee();

					System.out.println("Enter Employee Id");
					emp1.setEmpId(scan.nextInt());
					System.out.println("Enter Employee Name");
					emp1.setName(scan.next());
					System.out.println("Enter Employee Age ");
					emp1.setAge(scan.nextInt());
					System.out.println("Enter Employee Designation");
					emp1.setDesignation(scan.next());
					System.out.println("Enter Employee Department");
					emp1.setDepartment(scan.next());
					System.out.println("Enter Employee Country");
					emp1.setCountry(scan.next());

					empService.addEmployee(emp1);
					System.out.println("Employee has been added Succesfully ");
					break;

				case 2: // View Employee by ID
					try {
						System.out.println("Enter employee id to be viewed");
						Employee empView = null;
						empView = empService.viewEmployeeByID(scan.nextInt());
						if (empView != null) {
							System.out.println(empView);

						} else {
							System.out.println("\nThis employee does not exist!");
						}
					} catch (Exception e) {
						System.out.println("\nThis employee does not exist!");
					}
					break;

				case 3:// Update Employee by ID
					try {

						Employee empUpdate = new Employee();
						 System.out.println("Enter the employee id to be updated");
		           		 empId= scan.nextInt();
		                 System.out.println("Enter new Employee Name");
		                 name= scan.next();
		                 System.out.println("Enter new Employee Age");
		                 age= scan.nextInt();
		                 System.out.println("Enter new Employee Designation");
		                 designation = scan.next();
		                 System.out.println("Enter new Employee Department");
		                 department= scan.next();
		                 System.out.println("Enter new Employee Country");
		                 country = scan.next();
		                 
		                 empUpdate.setEmpId(empId);
		                 empUpdate.setName(name);
		                 empUpdate.setAge(age);
		                 empUpdate.setDesignation(designation);
		                 empUpdate.setDepartment(department);
		                 empUpdate.setCountry(country);

						System.out.println("Enter employee id to be updated");
						if (empService.updEmployeeById(empUpdate, empId)) {
							System.out.println("\nEmployee details updated successfully!!");
						} else {
							System.out.println("\nThis employee does not exist!");
						}
					} catch (Exception e) {
						System.out.println("\nThis employee does not exist!");
					}
					break;

				case 4:// Delete Employee by ID
					try {
						System.out.println("Enter the employee Id to delete");
						empId = scan.nextInt();
						if (empService.delEmployeeById(empId)) {
							System.out.println("\nEmployee deleted successfully!!");

						} else {
							System.out.println("\nThis employee does not exist!");
						}
					} catch (Exception e) {
						System.out.println("\nThis employee does not exist!");
					}

					break;

				case 5: // View All the employees
					empService.viewAllEmployees();
					break;
				case 6: // Exit from the app
					System.out.println("\nThank you for using Employee Management application!!");
					System.exit(0);
					break;
				default:
					System.out.println("\nInvalid option!\n");
					showEmployeeMainMenu();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (true);
	}

	public static void showEmployeeMainMenu() {

		System.out.println("\n1. Add Employee");
		System.out.println("2. View Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View All Employees");
		System.out.println("6. Exit");

	}

}