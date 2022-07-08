package com.pscmr.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pscmr.model.LoginPage;

public class MoneyTransactions{
	public int transfer(LoginPage log,int accountno,float transferamount) {
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
				balance=rs.getFloat(5);
				balance=balance-transferamount;
			}
			
			if(balance<0) {
				return 1;
			}
			ResultSet rs1=smt.executeQuery("SELECT * FROM customerinfo WHERE account_No='"+accountno+"';");
			float amount1=0;
			while(rs1.next()) {
				amount1=rs1.getFloat(5);
				amount1=amount1+transferamount;
			smt.executeUpdate("UPDATE customerinfo SET balance="+balance+" WHERE user_Name='"+username+"';");
			smt.executeUpdate("UPDATE customerinfo SET balance="+amount1+" WHERE account_No='"+accountno+"';");
			}
			return 2;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		return 0;
		
	}
	

}
