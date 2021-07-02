package com.personal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class UserDeleteDAO {
	private static final String  QUERY=" DELETE FROM user WHERE fname =?and lname=?";
	public int deleteUserDetails(HttpServletRequest req)
	{
		int k=0;
		try
		{
			Connection con=DBConn.getConn();
			PreparedStatement ps=con.prepareStatement(QUERY);
			ps.setString(1,req.getParameter("fname"));
			ps.setString(2,req.getParameter("lname"));
			k=ps.executeUpdate();
		
			
		}
		catch(Exception e) {e.printStackTrace();
		}
		return k;
		
}
}
