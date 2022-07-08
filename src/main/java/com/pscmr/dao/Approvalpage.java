package com.pscmr.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Approvalpage {
	public ResultSet approval() {
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String passkey="sai123456@SAI";
		try {
			Connection con=DriverManager.getConnection(url, user, passkey);
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM customerinfo WHERE status='pending';");
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
