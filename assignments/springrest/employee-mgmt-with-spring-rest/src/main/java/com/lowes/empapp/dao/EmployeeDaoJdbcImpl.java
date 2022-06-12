package com.lowes.empapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lowes.empapp.controller.EmployeeController;
import com.lowes.empapp.exception.EmployeeException;
import com.lowes.empapp.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
@Qualifier("employeeDao")
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	// public static DataSource dataSource;
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoJdbcImpl.class);

	@Autowired
	DataSource dataSource;

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// inserted using constructor injection.
	public EmployeeDaoJdbcImpl(DataSource dataSource) throws EmployeeException {
		this.dataSource = dataSource;

		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			// e.printStackTrace();
			logger.error("DB connection coudnt be established. Please ensure DB server is up and running. - " + e);
			throw new EmployeeException("Database server is not running. kindly check!!");
		}
		System.out.println("Connection created successfully " + conn);
	}

	public void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// e.printStackTrace();
				logger.error("Error occurred while closing the DB Connection - " + e);
			}
		}
	}

	@Override
	public Employee createEmployee(Employee emp) {
		boolean status = false;
		try {
			stmt = conn.createStatement();

			String query = "INSERT INTO employee (name,age,designation,department,country) VALUES(\"" + emp.getName()
					+ "\"," + emp.getAge() + ",\"" + emp.getDesignation() + "\",\"" + emp.getDepartment() + "\",\""
					+ emp.getCountry() + "\")";
			status = stmt.execute(query);

		} catch (SQLException e) {
			// e.printStackTrace();
			logger.error("Error occurred while inserting Employee data. - " + e);
			System.out.println("Error occurred while inserting Employee data");
		}

		return emp;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) throws EmployeeException {
		boolean status = false;
		try {
			Employee empUpdate = get(emp.getId());
			if (empUpdate != null) {

				stmt = conn.createStatement();

				String query = "UPDATE employee SET name = \"" + emp.getName() + "\", age = " + emp.getAge()
						+ " ,designation = \"" + emp.getDesignation() + "\" ,department = \"" + emp.getDepartment()
						+ "\",country=\"" + emp.getCountry() + "\" WHERE id = " + emp.getId();
				status = stmt.execute(query);
			} else
				throw new EmployeeException("Employee doesnt exist for the id -" + empId);

		} catch (SQLException e) {
			// e.printStackTrace();
			logger.error("Error occurred while updating Employee data. - " + e);
			System.out.println("Error occurred while Updating Employee data");
		}
		return emp;
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException {
//		boolean status = false;
//		Employee empDelete;
//		try {
//
//			empDelete = get(empId);
//			if (empDelete != null) {
//				stmt = conn.createStatement();
//				String query = "DELETE FROM employee WHERE id = " + empId;
//				status = stmt.execute(query);
//				
//			}
//			else
//				throw new EmployeeException("Employee doesnt exist for the id -" + empId);
//		} catch (SQLException e) {
//			// e.printStackTrace();
//			logger.error("Error occurred while deleting Employee data. - " + e);
//			System.out.println("Error occurred while deleting Employee data");
//			throw new EmployeeException("Employee doesnt exist for the id -" + empId);
//		}
//		return empDelete;

		// Deletion with Prepared Statement
		boolean status = false;
		String deleteQuery = "DELETE FROM employee WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, empId);
			int deleteCount = pstmt.executeUpdate();

			// persist the changes
			// conn.commit();
			if (deleteCount > 0)
				status = true;
			
		} catch (SQLException e) {

			// e.printStackTrace();
			logger.error("Error occurred while deleting Employee data. - " + e);
			throw new EmployeeException("Unable to delete employee");
		}

		return status;

	}

	@Override
	public Employee get(int empId) {
		Employee emp = null;
		String query = "SELECT * FROM employee WHERE id = " + empId;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String designation = rs.getString("designation");
				String department = rs.getString("department");
				String country = rs.getString("country");
				emp = new Employee(id, name, age, designation, department, country);

			}

		} catch (SQLException e) {
			// e.printStackTrace();
			logger.error("This employee does not exist! - " + empId);
			System.out.println("This employee does not exist!");
		}

		return emp;
	}

	@Override
	public List<Employee> displayEmployees() {

		List<Employee> employees = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employee");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String designation = rs.getString("designation");
				String department = rs.getString("department");
				String country = rs.getString("country");

				employees.add(new Employee(id, name, age, designation, department, country));
			}

		} catch (SQLException e) {
			// e.printStackTrace();
			logger.error("Error occurred while getting all the Employee data");
			System.out.println("Error occurred while getting all the Employee data");
		}

		return employees;

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
