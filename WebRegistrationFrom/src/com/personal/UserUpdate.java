package com.personal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserUpdate extends HttpServlet
	{

		public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, 
	    IOException 
		{
			UserBean ub=new UserUpdateDAO().getUserDetails(req);
			
			if(ub==null)
			{
				RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
				rd.forward(req, res);
				
			}
			else
			{
				req.setAttribute("fname",ub.getfName());
				req.setAttribute("lname",ub.getlName());
				req.setAttribute("mail",ub.geteMail());
				req.setAttribute("gen",ub.getGender());
				req.setAttribute("dob",ub.getDob());
				req.setAttribute("mobno",ub.getMobNo());
				req.setAttribute("company",ub.getCompanyName());
				req.setAttribute("city",ub.getCity());
				req.setAttribute("addr",ub.getAddr());
				RequestDispatcher rd=req.getRequestDispatcher("updateForm.jsp");
				rd.forward(req, res);
			}
		
}
}
