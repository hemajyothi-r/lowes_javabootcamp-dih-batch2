package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;
import java.util.List;
import com.lowes.empapp.exception.*;

public interface EmployeeService {

	public Employee createEmployee(Employee emp);

	public Employee updateEmployee(Employee emp) throws EmployeeException;

	public boolean deleteEmployee(int empId) throws EmployeeException;

	public Employee get(int empId) throws EmployeeException;

	public List<Employee> displayEmployees();
	
}
