package com.lowes.empapp;

import com.lowes.empapp.model.*;
import com.lowes.empapp.exception.*;
import com.lowes.empapp.service.*;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeManagementMain {

	public static int count = 1;
	static Scanner scan = new Scanner(System.in);
	static EmployeeServiceImpl empService = new EmployeeServiceImpl();

	public static void showEmployeeMainMenu() {

		System.out.println("\n1. Add Employee");
		System.out.println("2. View Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View All Employees");
		System.out.println("6. Print Statistics");
		System.out.println("7. Import");
		System.out.println("8. Export");
		System.out.println("9. Exit");

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Management App");

		ExecutorService executor = Executors.newWorkStealingPool(2);

		int empId;

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
					getEmployeeData(emp1, 1);
					empService.createEmployee(emp1);
					System.out.println("Employee has been added Succesfully ");
					break;

				case 2: // View Employee by ID

					System.out.println("Enter employee id to be viewed");
					Employee empView = null;
					try {
						empView = empService.get(scan.nextInt());
						if (empView != null) {
							Employee.printEmpHeader();
							System.out.println(empView);

						} else {
							System.out.println("\nThis employee does not exist!");
						}
					} catch (EmployeeException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 3:// Update Employee by ID
					System.out.println("Enter employee id to be updated");
					empId = scan.nextInt();
					Employee empUpdate = empService.get(empId);
					if (empUpdate != null) {
						getEmployeeData(empUpdate, 0);
						if (empService.updateEmployee(empUpdate))
							System.out.println("\nEmployee details updated successfully!!");
					} else
						System.out.println("\nThis employee does not exist!");

					break;

				case 4:// Delete Employee by ID
					System.out.println("Enter the employee Id to delete");
					empId = scan.nextInt();
					empService.deleteEmployee(empId);
					System.out.println("\nEmployee deleted successfully!!");

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

				case 6: // Print Statistics
					printStatistics();

					break;

				case 7: // Import the employees from the input file
					Future<Boolean> importFuture = executor.submit(new Callable<Boolean>() {
						@Override
						public Boolean call() throws Exception {
							System.out.println("Import Process on thread named: " + Thread.currentThread().getName());
							Thread.sleep(2000);
							empService.bulkImport();
							return true;
						}
					});
					break;
				case 8: // Export All the collection employees to text file
					Future<Boolean> exportFuture = executor.submit(new Callable<Boolean>() {
						@Override
						public Boolean call() throws Exception {
							System.out
									.println("Export Process on the thread named: " + Thread.currentThread().getName());
							Thread.sleep(2000);
							empService.bulkExport();
							return true;
						}
					});
					break;

				case 9: // Exit from the app
					System.out.println("\nThank you for using Employee Management application!!");
					executor.shutdown();
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

	private static void printStatistics() {

		System.out.println("No of employees older than thirty years: "
				+ empService.getEmployeeCountAgeGreaterThan(e -> e.getAge() > 30));
		System.out.println("List employee IDs older than thirty years:" + empService.getEmployeeIdsAgeGreaterThan(30));
		System.out.println("Employee count by Department:" + empService.getEmployeeCountByDepartment());
		System.out.println("Employee count by Department ordered:" + empService.getEmployeeCountByDepartmentOdered());
		System.out.println("Average Employee Age by Department:" + empService.getAvgEmployeeAgeByDept());
		System.out.println(
				"List Departments have more than 3 employees:" + empService.getDepartmentsHaveEmployeesMoreThan(3));
		System.out.println("List Employees starts with 'S':" + empService.getEmployeeNamesStartsWith("S"));
		System.out.println("Average Employee Service by Department: " + empService.getAvgEmployeeServiceByDept());
	}

	private static void getEmployeeData(Employee emp, int insertUpdate) throws NumberFormatException {
		System.out.println("Enter Employee Name");
		emp.setName(scan.next());
		try {
			boolean ageVal = false;
			do {
				System.out.println("Enter Employee Age");
				String err = "Invalid age, age range is between 18 and 60";
				emp.setAge(Integer.parseInt(scan.next()));
				ageVal = empService.validate(emp, err, e -> e.getAge() >= 18 && e.getAge() <= 60, msg -> {
					System.out.println(msg);
					return false;
				});

			} while (!ageVal);
			// emp.setAge(scan.nextInt());
		} catch (NumberFormatException e) {
			throw e;
		}
		System.out.println("Enter Employee Designation");
		emp.setDesignation(scan.next());
		System.out.println("Enter Employee Department");
		emp.setDepartment(scan.next());
		System.out.println("Enter Employee Country");
		emp.setCountry(scan.next());
		if (insertUpdate == 1) {
			System.out.println("Enter Employee Date of Joining Format MM/DD/YYYY");
			String doj = scan.next();
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate date = LocalDate.parse(doj, dateFormat);
			emp.setDoj(date);
		}

	}

}