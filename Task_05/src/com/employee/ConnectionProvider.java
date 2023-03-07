package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con;
	
public static Connection createConnection() {
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "admin";
		
		con = DriverManager.getConnection(url, user, password);
		
	} catch (Exception e) {

		System.out.println("Error Occured in the Connection...!!!");
		e.printStackTrace();
	}
	
	return con;
}


}