package com.lowes.empapp;

import com.lowes.empapp.model.*;
import com.lowes.empapp.exception.*;
import com.lowes.empapp.service.*;
import com.lowes.empapp.config.EmployeeConfig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmpAppWithSpring {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Management App");

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeServiceImpl employeeService = (EmployeeServiceImpl) context.getBean("employeeService");

		String doj = "09/23/2019";
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
		LocalDate date = LocalDate.parse(doj, dateFormat);

//		// View All Employees
//		System.out.println("View All Employees");
//		List<Employee> employees = employeeService.displayEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}

//		// Add new employee
		Employee emp1 = new Employee(12, "HemaNew", 23, "ManagerNew", "OperationsNew", "India", date);
////		Employee emp2 = new Employee(12, "Hema", 23, "Manager", "Operations", "India", date);
////		Employee emp3 = new Employee(12, "Hema", 23, "Manager", "Operations", "India", date);
//
//		employeeService.createEmployee(emp1);
//
//		// View all after adding new employee
//		System.out.println("View All Employees After inserting new data");
//		List<Employee> employees1 = employeeService.displayEmployees();
//		for (Employee employee : employees1) {
//			System.out.println(employee);
//		}

//		// Delete employee option
//		System.out.println("Delete Employee Id = 27");
//		int deleteMe = 27;
//		employeeService.deleteEmployee(deleteMe);
//
//		// View all after deleting an employee
//		System.out.println("View All Employees After inserting new data");
//		List<Employee> employees2 = employeeService.displayEmployees();
//		for (Employee employee : employees2) {
//			System.out.println(employee);
//		}

		// Update employee
		emp1.setEmpId(26);
		emp1.setAge(35);
		emp1.setName("TestUpdateNew");
		emp1.setCountry("NewCountryNew");
		emp1.setDepartment("NewDeptNew");
		emp1.setDesignation("NewDesignationNew");

		System.out.println("Update Employee Id");
		employeeService.updateEmployee(emp1);

		//Find employee by ID
		System.out.println("Find Employee Id");
		Employee employee = null;
		try {
			employee = employeeService.get(26);
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
		System.out.println(employee);
		
//		
//
//		System.out.println("View All Employees Again");
//		employees = employeeService.displayEmployees();
//		for (Employee e : employees) {
//			System.out.println(e);
//		}

		context.registerShutdownHook();

		// context.close();

	}

}
