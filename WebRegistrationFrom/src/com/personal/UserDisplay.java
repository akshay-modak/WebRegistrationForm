package com.personal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserDisplay 
extends HttpServlet
	{

		public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, 
	    IOException 
		{
		
			UserBean ub=new UserDisplayDAO().getUserDetails(req);		
		
		if(ub==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			
			req.setAttribute("ub",ub);
			RequestDispatcher rd=req.getRequestDispatcher("DisplayFinal.jsp");
			rd.forward(req, res);
			
		}

}
}