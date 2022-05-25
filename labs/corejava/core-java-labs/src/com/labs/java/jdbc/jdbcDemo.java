package com.labs.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) {

		System.out.println("JDBC demo......");

		// Step1: Load Driver

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver"); //deprecated
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: Driver not loaded " + e.getMessage());
			e.printStackTrace();
		}

		// Step2 : open connection to db

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctraining", "training", "training");
			System.out.println(con);
			System.out.println("Connected to database successfully");

			// step 3: create statement

			stmt = con.createStatement();

			// step 4 execute query

			String query = "Select * from employee";
			rs = stmt.executeQuery(query);

			// step 5: get resultset and access the results
			System.out.println("Query executed successfully: query " + query);
			System.out.println("Got results " + rs);
			
			System.out.println("EMP ID \t NAME \t AGE \t DESIGNATION \t DEPARTMENT \t COUNTRY" );
			
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String designation = rs.getString("designation");
				String department = rs.getString("department");
				String country = rs.getString("country");		
				 System.out.printf("%d \t %s \t %d \t %s \t %s \t %s \n", id, name, age, designation, department, country);
			}

		} catch (SQLException e) {
			System.out.println("Error: Unable to connect to DB " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("Error: while closing the resources " + e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
