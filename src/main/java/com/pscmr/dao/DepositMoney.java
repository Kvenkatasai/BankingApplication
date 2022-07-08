package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pscmr.model.LoginPage;

public class DepositMoney {
	public float deposit(LoginPage log ,float depositamt) {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String password="sai123456@SAI";
		String username=log.getUsername();
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM customerinfo WHERE user_Name='"+username+"';");
			float balance=0;
			while(rs.next()) {
				  balance = rs.getFloat(5);
				
			}
			balance=balance+depositamt;
			smt.executeUpdate("UPDATE customerinfo SET balance="+balance+" WHERE user_Name='"+username+"';");
			
			return balance;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}

}
