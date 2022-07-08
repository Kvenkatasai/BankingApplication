package com.pscmr.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pscmr.dao.Approvalpage;
import com.pscmr.dao.GetCustomerDetailes;

public class ViewCustomerDetailes {
	public void view() throws SQLException {
		GetCustomerDetailes gcd=new GetCustomerDetailes();
		ResultSet rs=gcd.getDetailes();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getFloat(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			System.out.println(rs.getInt(8));
			System.out.println(rs.getInt(9));
			System.out.println(rs.getString(10));
		}
	}
	public void pendingData() throws SQLException {
		Approvalpage ap=new Approvalpage();
		ResultSet rs=ap.approval();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getFloat(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			System.out.println(rs.getInt(8));
			System.out.println(rs.getInt(9));
			System.out.println(rs.getString(10));
			
		}
	}

}
