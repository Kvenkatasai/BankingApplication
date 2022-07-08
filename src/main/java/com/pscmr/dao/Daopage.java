package com.pscmr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.pscmr.model.ModelPage;
import com.pscmr.service.ServicePage;

public class Daopage {
	public int insertAccount(ModelPage detailes) {
		String url="jdbc:mysql://localhost:3306/bankinginfo";
		String user="root";
		String password="sai123456@SAI";
		String sql="INSERT INTO customerinfo VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		int status=0;
		
			try {
				Connection con=DriverManager.getConnection(url, user, password);
				PreparedStatement psmt=con.prepareStatement(sql);
				psmt.setString(1,detailes.getCustomer_name());
				psmt.setNull(2, Types.NULL);
				psmt.setString(3,detailes.getUsername());
				psmt.setString(4,detailes.getPassword());
				psmt.setFloat(5,detailes.getBalance());
				psmt.setString(6, detailes.getCustomer_email());
				psmt.setString(7,detailes.getCustomer_Dob());
				psmt.setInt(8,detailes.getPhone());
				psmt.setInt(9, 420420 );
				psmt.setString(10,"Accepted");
				
				status = psmt.executeUpdate();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return status;
		
		
		
		
	}

}
