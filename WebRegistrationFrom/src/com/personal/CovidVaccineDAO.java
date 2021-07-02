package com.personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequest;
public class CovidVaccineDAO
{

int k=0;
public int insert(ServletRequest req) {
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root", "root");
PreparedStatement ps=con.prepareStatement("insert into person values(?,?,?)");
ps.setString(1, req.getParameter("name"));
ps.setString(2, req.getParameter("gender"));
ps.setInt(3, Integer.parseInt(req.getParameter("age")));
k=ps.executeUpdate();
		

}
catch(Exception e)
{
e.printStackTrace();
}
return k;
}
}
