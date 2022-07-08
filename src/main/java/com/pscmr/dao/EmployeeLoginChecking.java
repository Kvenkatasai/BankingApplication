package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pscmr.model.LoginPage;

public class EmployeeLoginChecking {
	public int check(LoginPage log1) {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String passkey="sai123456@SAI";
		String username=log1.getUsername();
		String password=log1.getPassword();
		try {
			Connection con=DriverManager.getConnection(url,user,passkey);
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM employeeinfo WHERE Employee_Id='"+username+"';");
			String password1=null;
			while(rs.next()) {
				password1=rs.getString(3);
			}
			if(password.compareTo(password1)==0) {
				return 1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

}
