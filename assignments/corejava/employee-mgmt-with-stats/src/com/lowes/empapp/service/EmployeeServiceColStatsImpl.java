package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lowes.empapp.exception.*;

public class EmployeeServiceColStatsImpl implements EmployeeService {

	public static int index = 0;
	public static int empIdIndex = 1;

	public boolean found = false;

	private Map<Integer, Employee> employees = new HashMap<>();

	Comparator<Employee> EMPLOYEE_NAME_ASC_SORT = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public EmployeeServiceColStatsImpl() {
		employees.put(1, new Employee(1, "Hema", 38, "Delivery Manager", "Operations", "India"));
		employees.put(2, new Employee(2, "Jyothi", 42, "QA", "Infra", "India"));
		employees.put(3, new Employee(3, "Sammu", 28, "Developer", "Operations", "USA"));
		employees.put(4, new Employee(4, "Ajeya", 41, "Test Engineer", "Operations", "UK"));
		employees.put(5, new Employee(5, "Poorvi", 21, "Associate", "Admin", "Australia"));

	}

	@Override
	public boolean createEmployee(Employee emp) {
		emp.setEmpId(employees.size() + 1);
		return employees.put(emp.getEmpId(), emp) != null ? true : false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {

		return employees.put(emp.getEmpId(), emp) != null ? true : false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
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

	public void bulkImport() {
		System.out.println("Import Started " + Thread.currentThread().getName());
		BufferedReader in = null;
		String line = null;
		try {
			in = new BufferedReader(new FileReader(".\\input\\employee-input.txt"));
			while ((line = in.readLine()) != null) {
				String[] tokens = line.split(",");
				Employee emp = new Employee();
				emp.setName(tokens[1]);
				emp.setAge(Integer.parseInt(tokens[2]));
				emp.setDesignation(tokens[3]);
				emp.setDepartment(tokens[4]);
				emp.setCountry(tokens[5]);
				this.createEmployee(emp);
			}
			System.out.println("File Imported Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public synchronized void bulkExport() {

		System.out.format("%n%s - Export started %n", Thread.currentThread().getName());
		PrintWriter out = null;
		try {

			out = new PrintWriter(".\\output\\employee-output.txt");
			for (Employee emp : employees.values()) {
				out.write(emp.getEmpId() + "," + emp.getName() + "," + emp.getAge() + "," + emp.getDesignation() + ","
						+ emp.getDepartment() + "," + emp.getCountry() + "\n");
			}
			out.flush();
			System.out.println("\n" + "File copied successfully.");

		} catch (IOException e) {
			System.out.println("Error writing to file..");
		} finally {
			if (out != null) {
				out.close();
			}
		}

	}

	@Override
	public boolean validate(Employee emp, String msg, Predicate<Employee> condition,
			Function<String, Boolean> operation) {
		
		boolean status = condition.test(emp);
		
		if (!status) {
			return operation.apply(msg);
		}
		return status;
	}

	@Override
	public long getEmployeeCountAgeGreaterThan(Predicate<Employee> condition) {
		long count = this.displayEmployees().stream().filter(condition).count();
		return count;
	}

	@Override
	public List<Integer> getEmployeeIdsAgeGreaterThan(int age) {
		List<Integer> empIds = this.displayEmployees().stream().filter(emp -> emp.getAge() > age)
				.map(emp -> emp.getEmpId()).collect(Collectors.toList());
		return empIds;
	}

	@Override
	public Map<String, Long> getEmployeeCountByDepartment() {
		return this.displayEmployees().stream().map(Employee::getDepartment)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	@Override
	public Map<String, Long> getEmployeeCountByDepartmentOdered() {

		return this.displayEmployees().stream().map(Employee::getDepartment)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

	}

	@Override
	public Map<String, Double> getAvgEmployeeAgeByDept() {

		return this.displayEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));

	}

//	@Override
//	public Set<String> getDepartmentsHaveEmployeesMoreThan(int criteria) {
//
//		return this.displayEmployees().stream().collect(Collectors
//				.collectingAndThen(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()), map -> {
//					map.values().removeIf(l -> l <= criteria);
//					return map.keySet();
//				}));
//
//	}

	@Override
	public List<String> getDepartmentsHaveEmployeesMoreThan(int criteria) {
		return this.displayEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > criteria).map(Map.Entry::getKey).collect(Collectors.toList());
	}

	@Override
	public List<String> getEmployeeNamesStartsWith(String prefix) {

		List<String> names = this.displayEmployees().stream().filter(emp -> emp.getName().startsWith(prefix))
				.map(emp -> emp.getName()).collect(Collectors.toList());
		return names;

	}

}
