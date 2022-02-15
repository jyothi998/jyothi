package com.mondee;

import javax.servlet.annotation.WebServlet;


import javax.servlet.http.HttpServlet;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import javax.servlet.ServletConfig;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class doctorregister extends HttpServlet {
		   Connection con=null;
		   PreparedStatement ps=null;
		public void init(ServletConfig conflig) {
			 
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 String url="jdbc:mysql://localhost:3306/mondee";
		     String username="root";
		     String password="1234";
		     try {
				con=DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
			 
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String specialist=request.getParameter("specialist");
			
			PrintWriter pw=response.getWriter();
			String sql="insert into doctor(dname,email,password,specialist) values(?,?,?,?)";
			     try {
			    	ps=con.prepareStatement(sql);
			    	  ps.setString(1, username);
			    	  ps.setString(2, email);
			    	  ps.setString(3, password);
			    	  ps.setString(4, specialist);
					int x=ps.executeUpdate();
					if(x!=0)
					    response.sendRedirect("./doctor_login.html");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }
	}

