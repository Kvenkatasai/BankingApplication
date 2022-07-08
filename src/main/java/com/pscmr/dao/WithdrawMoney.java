package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pscmr.model.LoginPage;

public class WithdrawMoney {
	public int withdraw(LoginPage log,float withdrawamt) {
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
			balance=balance-withdrawamt;
			if(balance<0) {
				return 0;
			}
			else {
			smt.executeUpdate("UPDATE customerinfo SET  balance="+balance+" WHERE user_Name='"+username+"';");
			}
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

}
