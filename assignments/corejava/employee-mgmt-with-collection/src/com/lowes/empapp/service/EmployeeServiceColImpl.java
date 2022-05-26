package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lowes.empapp.exception.*;

public class EmployeeServiceColImpl implements EmployeeService {

	public static int index = 0;
	public static int empIdIndex = 1;

	public boolean found = false;

	private Map<Integer, Employee> employees = new HashMap<>();

	Comparator<Employee> EMPLOYEE_NAME_ASC_SORT = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public EmployeeServiceColImpl() {
		employees.put(1, new Employee(1, "Hema", 38, "Delivery Manager", "Operations", "India"));
		employees.put(2, new Employee(2, "Jyothi", 42, "QA", "Infra", "India"));
		employees.put(3, new Employee(3, "Sammu", 28, "Developer", "Operations", "USA"));
		employees.put(4, new Employee(4, "Ajeya", 41, "Test Engineer", "Operations", "UK"));
		employees.put(5, new Employee(5, "Poorvi", 21, "Associate", "Admin", "Australia"));

	}

	@Override
	public boolean createEmployee(Employee emp) {
		// emp.setEmpId(empIdIndex++);
		emp.setEmpId(employees.size() + 1);
		return employees.put(emp.getEmpId(), emp) != null ? true : false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
	
		return employees.put(emp.getEmpId(), emp) != null ? true : false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
//		Employee deletedEmp = employees.remove(empId); // returns value associated with the key after deleting
//		// if no value associated with the key, returns null
//		if (deletedEmp != null) {
//			found = true;
//		} else {
//			System.out.println("\nThis employee does not exist!");
//		}
//		return found;

		return employees.remove(empId) != null ? true : false;

	}

	@Override
	public Employee get(int empId) throws EmployeeException {
		Employee employee = findByEmpId(empId);
		if (employee == null)
			throw new EmployeeException("Employee does not exist");
		return employee;
	}

	@Override
	public List<Employee> displayEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>(employees.values());
		return employeeList;
	}

	public Employee findByEmpId(int empId) throws EmployeeException {
		Employee emp = employees.get(empId);
		if (emp == null) {
			throw new EmployeeException("\\nThis employee does not exist!");
		} else {
			return emp;
		}
	}

}
