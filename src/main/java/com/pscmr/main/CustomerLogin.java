package com.pscmr.main;

import java.util.Scanner;

import com.pscmr.model.LoginPage;
import com.pscmr.service.ConfirmLogin;

public class CustomerLogin {
	
	public void login() {
		Scanner sc=new Scanner(System.in);
		String username;
		String Password;
		System.out.println("Welcome to PSCMR bank");
		System.out.println("Please enter the username");
		username=sc.nextLine();
		System.out.println("please enter your password");
		Password=sc.nextLine();
		LoginPage Lp=new LoginPage();
		Lp.setUsername(username);
		Lp.setPassword(Password);
		ConfirmLogin cl=new ConfirmLogin();
		cl.check(Lp);
		
		
	}

}
