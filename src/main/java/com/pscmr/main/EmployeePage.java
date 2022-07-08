package com.pscmr.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.pscmr.dao.EmployeeLoginChecking;
import com.pscmr.model.LoginPage;

public class EmployeePage {
	public int login() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to PSCMR_Bank");
		System.out.println("Please enter EmplyeeId");
		String username=sc.nextLine();
		System.out.println("Please enter password");
		String password=sc.nextLine();
		LoginPage log1=new LoginPage();
		log1.setUsername(username);
		log1.setPassword(password);
		EmployeeLoginChecking ec=new EmployeeLoginChecking();
		int condition=ec.check(log1);
		if(condition==1) {
			System.out.println("Succesfully loggedin");
			AfterEmployeeLogin ael=new AfterEmployeeLogin();
			ael.login(log1);
			}
		else {
			System.out.println("enter valid detailes");
		}
		return 0;
		
	}

}
