package com.personal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class UserDisplayDAO {
	
		private static final String  QUERY=" select * FROM user WHERE fname =?and lname=?";
		public UserBean getUserDetails(HttpServletRequest req)
		{
			UserBean u=null;
			try
			{
				Connection con=DBConn.getConn();
				PreparedStatement ps=con.prepareStatement(QUERY);
				ps.setString(1,req.getParameter("fname"));
				ps.setString(2,req.getParameter("lname"));
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					u=new UserBean();
					u.setfName(rs.getString(1));
					u.setlName(rs.getString(2));
					u.seteMail(rs.getString(3));
					u.setGender(rs.getString(4));
					u.setDob(rs.getString(5));
					u.setMobNo(rs.getString(6));
					u.setCompanyName(rs.getString(7));
					u.setCity(rs.getString(8));
					u.setAddr(rs.getString(9));
				}
				
			}
			catch(Exception e) {e.printStackTrace();
			}
			return u;
	}

}
