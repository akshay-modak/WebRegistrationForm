package com.personal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DeleteUser extends HttpServlet
	{

		public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, 
	    IOException 
		{
			if(new UserDeleteDAO().deleteUserDetails(req)>0)
			{
				
				RequestDispatcher rd=req.getRequestDispatcher("deletesuccess.jsp");
				rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
				rd.forward(req, res);
				
			}
		
}
	}
