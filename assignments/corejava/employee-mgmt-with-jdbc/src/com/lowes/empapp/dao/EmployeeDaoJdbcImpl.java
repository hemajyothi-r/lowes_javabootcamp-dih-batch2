package com.lowes.empapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.lowes.empapp.exception.EmployeeException;
import com.lowes.empapp.model.Employee;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	MysqlDataSource dataSource = null;
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public EmployeeDaoJdbcImpl() {
		dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("jdbctraining");
		dataSource.setUser("training");
		dataSource.setPassword("training");

		try {
			conn = dataSource.getConnection();
			System.out.println("Connection created successfully " + conn);
		} catch (SQLException e) {
			// e.printStackTrace();
		}
	}

	@Override
	public boolean createEmployee(Employee emp) {
		boolean status = false;
		try {
			stmt = conn.createStatement();

			String query = "INSERT INTO employee (name,age,designation,department,country,dateofjoining,datecreated) VALUES(\""
					+ emp.getName() + "\"," + emp.getAge() + ",\"" + emp.getDesignation() + "\",\""
					+ emp.getDepartment() + "\",\"" + emp.getCountry() + "\",\"" + emp.getDoj() + "\",\""
					+ LocalDateTime.now() + "\")";
			status = stmt.execute(query);

		} catch (SQLException e) {
			// e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		boolean status = false;
		try {
			stmt = conn.createStatement();

			String query = "UPDATE employee SET name = \"" + emp.getName() + "\", age = " + emp.getAge()
					+ " ,designation = \"" + emp.getDesignation() + "\" ,department = \"" + emp.getDepartment()
					+ "\",country=\"" + emp.getCountry() + "\",datemodified=\"" + LocalDateTime.now() + "\" WHERE id = "
					+ emp.getEmpId();
			status = stmt.execute(query);

		} catch (SQLException e) {
			// e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean status = false;
		try {
			stmt = conn.createStatement();

			String query = "DELETE FROM employee WHERE id = " + empId;
			status = stmt.execute(query);

		} catch (SQLException e) {
			// e.printStackTrace();
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
				LocalDate doj = rs.getDate("dateofjoining").toLocalDate();

				emp = new Employee(id, name, age, designation, department, country, doj);

			}

		} catch (SQLException e) {
			// e.printStackTrace();
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
				LocalDate doj = rs.getDate("dateofjoining").toLocalDate();

				employees.add(new Employee(id, name, age, designation, department, country, doj));
			}

		} catch (SQLException e) {
			// e.printStackTrace();
		}

		return employees;

	}

}
