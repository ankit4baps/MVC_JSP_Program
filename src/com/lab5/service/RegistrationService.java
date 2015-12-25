package com.lab5.service;

import java.sql.*;
import java.io.*;
import com.lab5.controller.*;
import com.lab5.model.*;

public class RegistrationService {

	private static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/lab5";
	private static Connection connection;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	
	public static Connection getConnection() throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		}
		return connection;
	}
	
	public static void shutdown() throws SQLException {
		if(connection != null) {
			connection.close();
		}
	}
}
