package com.j2ee.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {

	public static int insert(String uname, String pwd, String fname, String mname, String lname, String email, String mob, String dob) {
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
			String query="insert into login_credential (username,password,fname,mname,lname,email,mobile,dob) values (?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ps.setString(3, fname);
			ps.setString(4, mname);
			ps.setString(5, lname);
			ps.setString(6, email);
			ps.setString(7, mob);
			ps.setString(8, dob);
			status=ps.executeUpdate();
			System.out.println("status afte excuting query ="+status);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}
