package com.pscmr.main;


import java.sql.SQLException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {
	private static final Logger log=LogManager.getLogger(HomePage.class);
	public static void main(String args[]) throws SQLException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to PSCMR_Bank");
		System.out.println("Press 1 if you are Customer");
		System.out.println("Press 2 if you are Employee");
		System.out.println("Enetr you choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			log.info("logged into customer");
			CustomerPage cp=new CustomerPage();
			cp.start();
			break;
			
		case 2:
			EmployeePage ep=new EmployeePage();
			ep.login();
			break;
		}
		
			
	}

}
