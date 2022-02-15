<html>
<body bgcolor ="#aaa">
<%@page import="java.sql.*"%>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
con=DriverManager.getConnection(url, user, pass);
String username=request.getParameter("username");
String password=request.getParameter("password");
String sql ="select * from manager where mname=? and password=?";
ps = con.prepareStatement(sql);
ps.setString(1, username);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next())
	session.setAttribute("mid",rs.getInt(1));
	session.setAttribute("designation",rs.getString(5));
	response.sendRedirect("manager_home.html");
%>
<h1>Login Successfully</h1>
</body>
</html>