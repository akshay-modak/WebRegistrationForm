package com.personal;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

public class UserRegistrationDAO {
	private static final String  QUERY="insert into user (fname,lname,mail,gender,dob,mobno,company,city,addr) values(?,?,?,?,?,?,?,?,?)";
	public int saveUserDetails(HttpServletRequest req,UserBean u)
	{
		int k=0;
		try
		{
		Connection con= DBConn.getConn();
		PreparedStatement ps=con.prepareStatement(QUERY);
		ps.setString(1,u.getfName() );
		ps.setString(2,u.getlName() );
		ps.setString(3,u.geteMail() );
		ps.setString(4, u.getGender());
		ps.setString(5, u.getDob());
		ps.setString(6, u.getMobNo());
		ps.setString(7, u.getCompanyName());
		ps.setString(8,u.getCity() );
		ps.setString(9, u.getAddr());
		//System.out.println(con);
		//System.out.println(con);
		//System.out.println(con);
		k=ps.executeUpdate();
		
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
