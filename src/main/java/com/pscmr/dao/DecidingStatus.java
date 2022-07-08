package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DecidingStatus {
	public int decide(int accountno,int x) {
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String password	="sai123456@SAI";
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement smt=con.createStatement();
			if(x==1) {
				smt.executeUpdate("UPDATE customerinfo SET status='Accepted' WHERE account_No='"+accountno+"';");
				
			}
			else {
			smt.executeUpdate("UPDATE customerinfo SET status='Rejected' WHERE account_No='"+accountno+"';");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
		
	}

}
