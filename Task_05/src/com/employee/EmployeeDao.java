package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class EmployeeDao {

	public static boolean insertEmployee(Employee employee) {
		boolean flag = false;
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String qurey = "insert into employees(empName, empDepartment, empDesignation, empEmail, empAddress, empContact) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(qurey);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2,employee.getDepartment());
			preparedStatement.setString(3,employee.getDesignation());
			preparedStatement.setString(4,employee.getEmail());
			preparedStatement.setString(5,employee.getAddress());
			preparedStatement.setString(6,employee.getContact());
			
			preparedStatement.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Employee Dao");
			e.printStackTrace();
		}
		
		return flag;
	}

	public static boolean deleteEmployee(String email) {
		boolean flag = false;
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String qurey = "delete from employees where empEmail = ?";
			PreparedStatement preparedStatement = con.prepareStatement(qurey);
			preparedStatement.setString(1,email);
		
			preparedStatement.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Employee Dao");
			e.printStackTrace();
		}
		
		return flag;
	}

	public static void showAllEmployee() {
		
      try{
			
			Connection con = ConnectionProvider.createConnection();
			
			String query = "select * from employees";
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String department = set.getString(3);
				String designation = set.getString(4);
				String email = set.getString(5);
				String address = set.getString(6);
				String contact = set.getString(7);
				
				System.out.println(" ID:"+id+
						           "\n Name: "+name+
						           "\n Department: "+department+
						           "\n Designation: "+designation+
						           "\n Email: "+email+
						           "\n Address: "+address+
						           "\n Contact: "+contact+"\n");
				
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Employee Dao");
			e.printStackTrace();
		}
		
		
	}

	public static void searchEmployee(String ema) {
		  try{
				System.out.println("Inside search..!!!");
				Connection con = ConnectionProvider.createConnection();
				
				String query = "select * from employees where empEmail=?";
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setString(1,ema);
				ResultSet set = preparedStatement.executeQuery();
				
				if(!set.isBeforeFirst()) 
					{
					System.out.println("No Record Found...!!!");
					
					}
				else {
				System.out.println("Inside search..!!!");
				while(set.next()) {
					int id = set.getInt(1);
					String name = set.getString(2);
					String department = set.getString(3);
					String designation = set.getString(4);
					String email = set.getString(5);
					String address = set.getString(6);
					String contact = set.getString(7);
					
					System.out.println(" ID:"+id+
							           "\n Name: "+name+
							           "\n Department: "+department+
							           "\n Designation: "+designation+
							           "\n Email: "+email+
							           "\n Address: "+address+
							           "\n Contact: "+contact+"\n");
					
				}
				
				
				}
				
				
			} catch (Exception e) {
				System.out.println("Error Occured in the Employee Dao");
				e.printStackTrace();
			}
			
		
	}

	
	

	public static boolean UpdateEmployeeContact(String email, String newContact) {
	
		boolean flag = false;
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String qurey = "update employees set empContact=? where empEmail = ?";
			PreparedStatement preparedStatement = con.prepareStatement(qurey);
			preparedStatement.setString(1, newContact);
			preparedStatement.setString(2,email);
		
			preparedStatement.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Employee Dao");
			e.printStackTrace();
		}
		
		return flag;
	}

	public static boolean UpdateEmployeeAddress(String email, String newAddress) {
		
		boolean flag = false;
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String qurey = "update employees set empAddress=? where empEmail = ?";
			PreparedStatement preparedStatement = con.prepareStatement(qurey);
			preparedStatement.setString(1, newAddress);
			preparedStatement.setString(2,email);
		
			preparedStatement.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Employee Dao");
			e.printStackTrace();
		}
		
		return flag;
	}
	}




