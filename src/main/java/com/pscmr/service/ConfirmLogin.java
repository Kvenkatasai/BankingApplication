package com.pscmr.service;

import com.pscmr.dao.VerifyingLogin;
import com.pscmr.main.CustomerServices;
import com.pscmr.model.LoginPage;

public class ConfirmLogin {
	public int check( LoginPage ld) {
		VerifyingLogin vl=new VerifyingLogin();
		int condition=vl.verify(ld);
		switch(condition) {
		case 1:
			System.out.println("your application for account creation is in pending stage");
			break;
		case 2:
			System.out.println("your applicatin for account creation is rejected");
			break;
		case 3:
			System.out.println("Sucessfully loggedin ");
			CustomerServices cs=new CustomerServices();
			cs.service(ld);
			break;
		default:
			break;
			
		
		}
		return 0;
		
	}

}
