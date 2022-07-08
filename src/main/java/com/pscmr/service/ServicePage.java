package com.pscmr.service;

import com.pscmr.dao.Daopage;
import com.pscmr.model.ModelPage;

public class ServicePage {
	public int createAccount(ModelPage mp) {
		Daopage dp=new Daopage();
		int result=dp.insertAccount(mp);
		
		return result ;
		
	}

}
