package com.mkpits.dataconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mkpits.cfs.WhileLoop;

public class DBConnection {

	static Connection con;
	static PreparedStatement pst;
	public static boolean getDBConnection()throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://technocrats.store:3306/technocr_mkpits","technocr","ys*3u*9N7LVr0L");  
		
			return true;
	}
	
	public static void insertData()throws Exception {
		WhileLoop w = new WhileLoop();
        pst = con.prepareStatement("insert into Bank(name,email,mobile,gender,age,accNumber) values(?,?,?,?,?,?)");
		
		pst.setString(1, w.name);
		pst.setString(2, w.email);
		pst.setString(3, w.mobile);
		pst.setString(4, w.gender);
		pst.setString(5, w.age);
		pst.setInt(6, w.accountNumber);
		
		pst.execute();
		
	}
}
