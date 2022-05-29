package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import com.lowes.empapp.exception.*;

public interface EmployeeService {

	public boolean createEmployee(Employee emp);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int empId);

	public Employee get(int empId) throws EmployeeException;

	public List<Employee> displayEmployees();

	public void bulkImport();

	public void bulkExport();

	public boolean validate(Employee emp, String msg, Predicate<Employee> condition,
			Function<String, Boolean> operation);

	public long getEmployeeCountAgeGreaterThan(Predicate<Employee> condition);

	public List<Integer> getEmployeeIdsAgeGreaterThan(int age);

	public Map<String, Long> getEmployeeCountByDepartment();

	public Map<String, Long> getEmployeeCountByDepartmentOdered();

	public Map<String, Double> getAvgEmployeeAgeByDept();

	//public List<String> getDepartmentsHaveEmployeesMoreThan(int criteria);
	public Set<String> getDepartmentsHaveEmployeesMoreThan(int criteria);

	public List<String> getEmployeeNamesStartsWith(String prefix);
}
