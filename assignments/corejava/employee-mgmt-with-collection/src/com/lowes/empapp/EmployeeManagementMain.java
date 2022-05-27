package com.lowes.empapp;

import com.lowes.empapp.model.*;
import com.lowes.empapp.exception.*;
import com.lowes.empapp.service.*;

import java.util.List;
import java.util.Scanner;
import java.io.*;

public class EmployeeManagementMain {

	public static int count = 1;
	static Scanner scan = new Scanner(System.in);

	public static void showEmployeeMainMenu() {

		System.out.println("\n1. Add Employee");
		System.out.println("2. View Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View All Employees");
		System.out.println("6. Exit");

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Management App");
		EmployeeServiceColImpl empService = new EmployeeServiceColImpl();

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
					getEmployeeData(emp1);
					empService.createEmployee(emp1);
					System.out.println("Employee has been added Succesfully ");
					break;

				case 2: // View Employee by ID

					System.out.println("Enter employee id to be viewed");
					Employee empView = null;
					try {
						empView = empService.findByEmpId(scan.nextInt());
						if (empView != null) {
							Employee.printEmpHeader();
							System.out.println(empView);

						} else {
							System.out.println("\nThis employee does not exist!");
						}
					} catch (EmployeeException e) {
						//System.out.println(e.getMessage());
					}
					break;

				case 3:// Update Employee by ID
					System.out.println("Enter employee id to be updated");
					empId = scan.nextInt();
					Employee empUpdate;
					try {
						empUpdate = empService.findByEmpId(empId);
					} catch (EmployeeException e) {
						//System.out.println(e.getMessage());
						break;
					}

					getEmployeeData(empUpdate);
					empService.updateEmployee(empUpdate);

					System.out.println("\nEmployee details updated successfully!!");
					break;

				case 4:// Delete Employee by ID
					System.out.println("Enter the employee Id to delete");
					empId = scan.nextInt();
					if (empService.deleteEmployee(empId)) {
						System.out.println("\nEmployee deleted successfully!!");

					} else {
						System.out.println("\nThis employee does not exist!");
					}
					break;

				case 5: // View All the employees
					List<Employee> employees = empService.displayEmployees();
					if (!employees.isEmpty()) {
						Employee.printEmpHeader();
						for (Employee emp : employees) {
							System.out.println(emp);
						}
					} else {
						System.out.println("\nNo records found!!!");
					}
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

	private static void getEmployeeData(Employee emp) throws NumberFormatException {
		System.out.println("Enter Employee Name");
		emp.setName(scan.next());
		System.out.println("Enter Employee Age");
		emp.setAge(scan.nextInt());
		System.out.println("Enter Employee Designation");
		emp.setDesignation(scan.next());
		System.out.println("Enter Employee Department");
		emp.setDepartment(scan.next());
		System.out.println("Enter Employee Country");
		emp.setCountry(scan.next());

	}

}