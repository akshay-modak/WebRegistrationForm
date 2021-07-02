package com.personal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class CovidVaccine extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(Integer.parseInt(req.getParameter("age"))>18)
		{
			pw.write("YOu are eligible for the Covid vaccine");
			if(new CovidVaccineDAO().insert(req)>0)
			{
				pw.write("Youre Details saved searching for the slot");
			}
		}
		else
		{
			pw.write("You are not eligible for the vaccine");
		}
		
	}

}
