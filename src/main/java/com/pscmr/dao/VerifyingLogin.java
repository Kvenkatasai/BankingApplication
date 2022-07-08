package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pscmr.model.LoginPage;

public class VerifyingLogin {
	public int verify(LoginPage log) {
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String username1="root";
		String password="sai123456@SAI";
		String username=log.getUsername();
		String Password1=log.getPassword();
		
		
		
		try {
			Connection con=DriverManager.getConnection(url, username1, password);
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM customerinfo WHERE user_Name='"+username+"';");
			String username2=null;
			String password2= null;
			String status=null;
			
			
			
			while(rs.next()) {
				username2=rs.getString(3);
				password2=rs.getString(4);
				status=rs.getString(10);
				
				}
			
			
			
			if(status.compareTo("Pending")==0)
				return 1;
			 if(status.compareTo("Rejected")==0)
				return 2;
			 if(username.compareTo(username2)==0 && Password1.compareTo(password2)==0)
				return 3;
			
			
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				return 0;
		
	}

}
