package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lowes.empapp.dao.EmployeeDao;
import com.lowes.empapp.dao.EmployeeDaoJdbcImpl;
import com.lowes.empapp.exception.*;

public class EmployeeServiceImpl  {

	@Autowired(required=true)
	public EmployeeDao employeeDao;

	private List<Employee> employees = null;
		
	public EmployeeServiceImpl() {
		try {
			//employeeDao = new EmployeeDaoJdbcImpl();
			
		} catch (Exception e) {
		
			System.out.println("Database server connectivity issue!! Unable to establish DB Connection.");
		}
	}


	public EmployeeServiceImpl(EmployeeDaoJdbcImpl employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	

	public boolean createEmployee(Employee emp) {
		
		return employeeDao.createEmployee(emp);
	}

	public boolean updateEmployee(Employee emp) {

		return employeeDao.updateEmployee(emp);
	}

	public boolean deleteEmployee(int empId) {
		return employeeDao.deleteEmployee(empId);

	}

	public Employee get(int empId) throws EmployeeException {
		return employeeDao.get(empId);
	}

	public List<Employee> displayEmployees() {

		return employeeDao.displayEmployees();
	}	
}
