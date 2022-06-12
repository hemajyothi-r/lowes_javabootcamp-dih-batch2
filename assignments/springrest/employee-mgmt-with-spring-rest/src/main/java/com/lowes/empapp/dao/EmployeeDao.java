package com.lowes.empapp.dao;

import java.util.List;

import com.lowes.empapp.exception.EmployeeException;
import com.lowes.empapp.model.Employee;

public interface EmployeeDao {

	// Create/Insert Employee into DB
	public Employee createEmployee(Employee emp);

	// Update Emp data
	public Employee updateEmployee(int empId, Employee emp) throws EmployeeException;

	//Delete Emp Data
	public boolean deleteEmployee(int empId) throws EmployeeException;

	//Read Emp data for the given ID
	public Employee get(int empId);

	//Read all Employee
	public List<Employee> displayEmployees();

}
