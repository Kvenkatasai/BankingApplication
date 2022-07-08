package com.pscmr.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.pscmr.dao.VerifyingLogin;
import com.pscmr.model.LoginPage;

public class Testing {
	@Test
	public void loginCheck() {
		VerifyingLogin vl=new VerifyingLogin();
		LoginPage log=new LoginPage();
		log.setUsername("shiva_s");
		log.setPassword("678567");
		int x=vl.verify(log);
		assertEquals(1,x);
	}
	 @Test
	    public void logicChecking1() {
	    	VerifyingLogin vl=new VerifyingLogin();
			LoginPage log=new LoginPage();
			log.setUsername("asif_sayyad");
			log.setPassword("sayyad@123");
			int x=vl.verify(log);
			assertEquals(3,x);
	    }
	 @Test
    public void logicChecking2() {
    	VerifyingLogin vl=new VerifyingLogin();
		LoginPage log=new LoginPage();
		log.setUsername("ram_r");
		log.setPassword("ram@123");
		int x=vl.verify(log);
		assertEquals(3,x);
    }
    
}
