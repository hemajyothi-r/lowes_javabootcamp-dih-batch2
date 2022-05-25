package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;

import java.util.List;

import com.lowes.empapp.exception.*;

public interface EmployeeService {

	public boolean addEmployee(Employee emp);
	
	public boolean delEmployeeById(int empId);

	public boolean updEmployeeById(Employee emp, int empId) ;

	public void viewAllEmployees();
	
	public Employee viewEmployeeByID(int empId) ;
	
}
