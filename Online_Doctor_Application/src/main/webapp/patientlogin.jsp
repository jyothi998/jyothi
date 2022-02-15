<html>
<body>
    <%@page import="java.sql.*"%>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/mondee";
	     String user="root";
	     String pass="1234";
	   con=DriverManager.getConnection(url, user, pass);
	   String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sql="select * from patient where pname=? and password=?";
		PreparedStatement ps=con.prepareStatement(sql);
  	       ps.setString(1, username);
  	       ps.setString(2, password);
  	     ResultSet rs=ps.executeQuery();
			if(rs.next())
				session.setAttribute("pid", rs.getInt(1));
			    response.sendRedirect("./patient_home.html");
    %>
</body>
</html>  