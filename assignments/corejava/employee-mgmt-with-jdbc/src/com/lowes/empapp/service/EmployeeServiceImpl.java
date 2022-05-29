package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lowes.empapp.dao.EmployeeDao;
import com.lowes.empapp.dao.EmployeeDaoJdbcImpl;
import com.lowes.empapp.exception.*;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao;

	Comparator<Employee> EMPLOYEE_NAME_ASC_SORT = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoJdbcImpl();
	}

	@Override
	public boolean createEmployee(Employee emp) {
		return employeeDao.createEmployee(emp);
	}

	@Override
	public boolean updateEmployee(Employee emp) {

		return employeeDao.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return employeeDao.deleteEmployee(empId);

	}

	@Override
	public Employee get(int empId) throws EmployeeException {
		return employeeDao.get(empId);
	}

	@Override
	public List<Employee> displayEmployees() {

		return employeeDao.displayEmployees();
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
				emp.setEmpId(Integer.parseInt(tokens[0]));
				emp.setName(tokens[1]);
				emp.setAge(Integer.parseInt(tokens[2]));
				emp.setDesignation(tokens[3]);
				emp.setDepartment(tokens[4]);
				emp.setCountry(tokens[5]);
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
				LocalDate date = LocalDate.parse(tokens[6], dateFormat);
				emp.setDoj(date);
				//emp.setDoj(LocalDate.parse(tokens[6], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
								
				this.createEmployee(emp);
			}
			System.out.println("Bulk Import Success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public synchronized void bulkExport() {

		System.out.format("%n%s - Export started %n", Thread.currentThread().getName());
		PrintWriter out = null;

		List<Employee> employees = new ArrayList<>();
		employees = displayEmployees();

		try {

			out = new PrintWriter(".\\output\\employee-output.txt");
			for (Employee emp : employees) {
				out.write(emp.getEmpId() + "," + emp.getName() + "," + emp.getAge() + "," + emp.getDesignation() + ","
						+ emp.getDepartment() + "," + emp.getCountry() + "," + emp.getDoj() + "\n");
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
		if (!condition.test(emp)) {
			return operation.apply(msg);
		}
		return true;
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

	@Override
	public Set<String> getDepartmentsHaveEmployeesMoreThan(int criteria) {

		return this.displayEmployees().stream().collect(Collectors
				.collectingAndThen(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()), map -> {
					map.values().removeIf(l -> l <= 3);
					return map.keySet();
				}));

	}

	@Override
	public List<String> getEmployeeNamesStartsWith(String prefix) {

		List<String> names = this.displayEmployees().stream().filter(emp -> emp.getName().startsWith(prefix))
				.map(emp -> emp.getName()).collect(Collectors.toList());
		return names;

	}
	
	@Override
	public Map<String, Double> getAvgEmployeeServiceByDept() {
		// TODO Auto-generated method stub
		return null;
	}

}
