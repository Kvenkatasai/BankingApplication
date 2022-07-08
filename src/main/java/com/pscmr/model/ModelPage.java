package com.pscmr.model;

public class ModelPage {
	private String user_Name;
	private String customer_name;
	private String Password;
	private Float Balance;
	private String Customer_email;
	private String Customer_Dob;
	private int Phone;
	private String status;
	public ModelPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelPage(String username, String customer_name, String password, Float balance, String customer_email,
			String customer_Dob, int phone, String status) {
		super();
		this.user_Name = username;
		this.customer_name = customer_name;
		Password = password;
		Balance = balance;
		Customer_email = customer_email;
		Customer_Dob = customer_Dob;
		Phone = phone;
		this.status = status;
	}
	public String getUsername() {
		return user_Name;
	}
	public void setUsername(String username) {
		this.user_Name = username;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Float getBalance() {
		return Balance;
	}
	public void setBalance(Float balance) {
		Balance = balance;
	}
	public String getCustomer_email() {
		return Customer_email;
	}
	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}
	public String getCustomer_Dob() {
		return Customer_Dob;
	}
	public void setCustomer_Dob(String customer_Dob) {
		Customer_Dob = customer_Dob;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	
	

}