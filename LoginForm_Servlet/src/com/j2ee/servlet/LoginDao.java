package com.j2ee.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validate(String uname, String pwd) {
		boolean status= false;
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
			PreparedStatement ps= con.prepareStatement("select * from login_credential where username= ? and password= ?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
				}
		catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}

}
