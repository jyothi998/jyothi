<html>
<body bgcolor ="wheat">
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
String email=request.getParameter("email");
String designation=request.getParameter("designation");
String sql="insert into employee(ename,password,email,designation)values(?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setString(1, username);
ps.setString(2, password);
ps.setString(4, email);
//ps.setString(5, phone);
ps.setString(3, designation);
int x = ps.executeUpdate();
if(x!= 0)
	response.sendRedirect("employee_login.html");
%>
</html>
</html>