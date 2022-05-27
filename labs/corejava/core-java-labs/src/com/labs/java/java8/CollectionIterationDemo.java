package com.labs.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.labs.java.collection.Employee;

public class CollectionIterationDemo {

	public static void main(String[] args) {

		Map<Integer, Employee> employees = new TreeMap<>();

		employees.put(100, new Employee(102, "Jyothi", 26, "Lead","CO", "USA",20000.0));
		employees.put(101, new Employee(101, "Hema", 24, "Developer", "IT", "India", 40000.0));
		employees.put(102, new Employee(103, "Ajeya", 20, "Lead","Admin", "UK", 50000.0));
		employees.put(103, new Employee(104, "Sammu", 27, "System Engineer","CO",  "Australia", 35000.0));
		
		System.out.println("No of employees: " + employees.size());
		
		//List<Integer> empIds = new ArrayList<>();
//		//fetch list of emplpoyee ids
//		for(Employee emp: employees.values()) {
//			empIds.add(emp.getEmpId());
//		}

		
//		System.out.println(empIds);
//		
//		System.out.println("collection foreach");
//		employees.values().forEach(e -> empIds.add(e.getEmpId()));
//		System.out.println(empIds);
//		
		
		//Map<String, List<Employee>> groupByDesig = new 
		
		
		employees.values()
					.stream()  //streaming source
						.filter(e -> "Lead".equals(e.getDesignation())) // intermediate operation 1-> filters employees based on designation
						.map(e -> e.getEmpId())  // intermediate operation 2 -> extracts empid
						.collect(Collectors.toList()) // terminal operation -> list of filtered employees
						.forEach(System.out::println); // display filtered employees
		
		
	}
	
	

}
