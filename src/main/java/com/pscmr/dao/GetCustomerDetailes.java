package com.pscmr.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetCustomerDetailes {
	public ResultSet getDetailes() {
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String password	="sai123456@SAI";
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM customerinfo");
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
