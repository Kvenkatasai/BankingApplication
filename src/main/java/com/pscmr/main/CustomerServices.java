package com.pscmr.main;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pscmr.dao.AccountNum;
import com.pscmr.dao.BalanceEnquiry;
import com.pscmr.dao.DepositMoney;
import com.pscmr.dao.MoneyTransactions;
import com.pscmr.dao.WithdrawMoney;
import com.pscmr.model.LoginPage;

public class CustomerServices {
	private static final Logger log1=LogManager.getLogger(CustomerServices.class);
	public int service(LoginPage log) {
		System.out.println("Press 1 for checking your account balance");
		System.out.println("Press 2 to get your accountNumber");
		System.out.println("Press 3 to Deposit money");
		System.out.println("Press 4 to withdraw money");
		System.out.println("Press 5 to transfer money to another account");
		
		Scanner sc=new Scanner(System.in);
		int condition=sc.nextInt();
		switch(condition) {
		case 1:
			BalanceEnquiry be=new BalanceEnquiry();
			log1.info("checking bank balance");
			float balance=be.balance(log);
			log1.info("successfully fetched balance");
			System.out.println(balance);
			
			break;
			
		case 2:
			AccountNum an=new AccountNum();
			int accountno=an.getAccountNum(log);
			System.out.println("Your accouny number is:"+accountno);
			break;
			
		case 3	:
			System.out.println("enter the amount to deposit");
			DepositMoney dm=new DepositMoney();
			float depositAmount=sc.nextFloat();
			float newBalance=dm.deposit(log,depositAmount);
			System.out.println("your current balance after deposit:"+newBalance);
			break;
			
		case 4:
			System.out.println("Enter the amount to withdraw");
			float withdrawamount=sc.nextFloat();
			WithdrawMoney wm=new WithdrawMoney();
			float status=wm.withdraw(log, withdrawamount);
			if(status==0) {
				System.out.println("unable to process due to insufficient funds");
				}
			else {
				System.out.println("Withdrawal is successful");
			}
			break;
		case 5:
			System.out.println("Enter the accountnumber to which you want to transfer money");
			int accountno1=sc.nextInt();
			System.out.println("Enter the amount you want to transfer");
			float transferamount=sc.nextFloat();
			MoneyTransactions mt=new MoneyTransactions();
			int status1=mt.transfer(log, accountno1, transferamount);
			if(status1==1) {
				System.out.println("Insufficient balance unable to transfer amount");
			}
			else {
				System.out.println("Money transfered successfully");
			}
			break;
			
			
			
		}
		return 0;
		
	}

}
 