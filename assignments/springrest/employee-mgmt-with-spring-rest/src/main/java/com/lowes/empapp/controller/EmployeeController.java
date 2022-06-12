package com.lowes.empapp.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lowes.empapp.exception.EmployeeException;
import com.lowes.empapp.exception.EmployeeNotFoundException;
import com.lowes.empapp.model.Employee;
import com.lowes.empapp.model.ResponseMessage;
import com.lowes.empapp.service.EmployeeService;
import com.lowes.empapp.service.EmployeeServiceImpl;

/**
 * Handles requests for the employee management.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	@Qualifier("employeeValidator")
	private Validator validator;

	@Autowired
	EmployeeServiceImpl employeeService;

	@RequestMapping(value = { "/employee" }, method = RequestMethod.GET)
	public String employee() {
		return "Welcome to RESTful Employee Management Service!";
	}

	// List Employees
	@GetMapping
	public List<Employee> getAll() throws EmployeeException {
		return employeeService.displayEmployees();
	}

	// Get Employee based on given ID
	@GetMapping("/{id}")
	public Employee get(@PathVariable int id) throws EmployeeException {
		Employee empGet = employeeService.get(id);
		if (empGet == null) {
			logger.error("This employee id does not exist--" + id);
			throw new EmployeeNotFoundException("This Employee Id doesnt exist: " + id);
		}
		return empGet;
	}

	// update Employee
	@PutMapping(path = "/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Employee employee)
			throws EmployeeException {
		employee.setId(id);

		this.get(id);
		Employee empUpdate = employeeService.updateEmployee(id, employee);
		if (empUpdate == null) {
			logger.error("This employee id does not exist--" + id);
			throw new EmployeeNotFoundException("This Employee Id doesnt exist: : " + id);
		} else
			return ResponseEntity.ok().body("Employee updated successfully");
	}

	// Delete Employee
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) throws EmployeeException {

		boolean delStatus = employeeService.deleteEmployee(id);

		if (delStatus == true)
			return ResponseEntity.ok().body("Employee deleted successfully");
		else {
			logger.error("This employee id does not exist--" + id);
			throw new EmployeeNotFoundException("This Employee Id doesnt exist: : " + id);
		}
	}

	// Create Employee
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ResponseMessage> create(@RequestBody Employee employee)
			throws URISyntaxException, EmployeeException {
		// Add employee logic
		employeeService.createEmployee(employee);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId())
				.toUri();

		ResponseMessage response = new ResponseMessage("Success", "Employee created successfully");
		return ResponseEntity.created(location).body(response);
	}


}
