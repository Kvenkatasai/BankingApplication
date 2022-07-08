package com.pscmr.main;

import java.util.Scanner;

import com.pscmr.model.ModelPage;
import com.pscmr.service.ServicePage;

public class CustomerPage {
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 if you are new Customer");
		System.out.println("Press 2 if you are already a customer to login");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Plase enter the detailes");
			System.out.println("Please enter your Name");
			String customer_name=sc.next();
			
			System.out.println("Please select your UserName");
			String user_Name=sc.next();
			System.out.println("please select password");
			String password=sc.next();
			System.out.println("plase add account balance");
			float Balance=sc.nextFloat();
			System.out.println("please enter your email");
			sc.nextLine();
			String Customer_email=sc.nextLine();
			System.out.println("Please enter your date-of-birth");
			String Customer_Dob=sc.nextLine();
			System.out.println("Please enter your contact number");
			int Phone=sc.nextInt();
			System.out.println("You have succesfully created account");
			
			ModelPage mp=new ModelPage();
			mp.setCustomer_name(customer_name);
			mp.setUsername(user_Name);
			mp.setPassword(password);
			mp.setBalance(Balance);
			mp.setCustomer_email(Customer_email);
			mp.setCustomer_Dob(Customer_Dob);
			mp.setPhone(Phone);
			
			ServicePage sp=new ServicePage();
			int status=sp.createAccount(mp);
			break;
			
		case 2:
			CustomerLogin cl=new CustomerLogin();
			cl.login();
		}
	}

}
