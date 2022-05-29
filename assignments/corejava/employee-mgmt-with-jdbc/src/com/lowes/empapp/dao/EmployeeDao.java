package com.lowes.empapp.dao;

import java.util.List;

import com.lowes.empapp.exception.EmployeeException;
import com.lowes.empapp.model.Employee;

public interface EmployeeDao {

	public boolean createEmployee(Employee emp);

    public boolean updateEmployee(Employee emp);

    public boolean deleteEmployee(int empId);

    public Employee get(int empId);

    public List<Employee> displayEmployees();
    
}
