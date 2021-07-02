package com.personal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FinalUpdate extends HttpServlet
{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, 
    IOException 
	{
		UserBean u=new UserBean();
		u.setfName(req.getParameter("firstname"));
		u.setlName(req.getParameter("lastname"));
		u.seteMail(req.getParameter("email"));
		u.setGender(req.getParameter("gender"));
		u.setDob(req.getParameter("bdate"));
		u.setMobNo(req.getParameter("phone"));
		u.setCompanyName(req.getParameter("cname"));
		u.setCity(req.getParameter("city"));
		u.setAddr(req.getParameter("address"));
		
		if(new FinalUpdateDAO().updateUserDetails(req, u)>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
			
		}
		
		
	}
	
	
}
