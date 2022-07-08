package com.pscmr.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.pscmr.dao.DecidingStatus;
import com.pscmr.model.LoginPage;
import com.pscmr.service.ViewCustomerDetailes;

public class AfterEmployeeLogin {
	public int login(LoginPage log1) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to view the customer detailes");
		System.out.println("Press 2 to accept or reject new customers");
		System.out.println("Press 3 to logout");
		int n=sc.nextInt();
		switch(n) {
		
		case 1:
			ViewCustomerDetailes vcd=new ViewCustomerDetailes();
			vcd.view();
			
		case 2:
			ViewCustomerDetailes vcd1=new ViewCustomerDetailes();
			vcd1.pendingData();
			System.out.println("Enter the accountnumber you want to approve or reject");
			int accountnum=sc.nextInt();
			System.out.println("Enter 1 to accept and 2 to reject customer apllication");
			int x=sc.nextInt();
			DecidingStatus ds=new DecidingStatus();
			ds.decide(accountnum, x);
			System.out.println(" Customer appllication status decided");
			break;
			
			default:
				break;
			
		}
		
			
		
		return 0;
		
	}

}
