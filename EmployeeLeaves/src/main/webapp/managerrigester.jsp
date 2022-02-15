<html>
<body bgcolor ="wheat">
<%@page import="java.sql.*"%>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
con=DriverManager.getConnection(url, user, pass);
String ename=request.getParameter("username");
String password=request.getParameter("password");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
long mobile=Long.parseLong(phone);
String designation=request.getParameter("Designation");
String sql="insert into manager(ename,password,email,designation)values(?,?,?,?)";
ps = con.prepareStatement(sql);
ps.setString(1, ename);
ps.setString(2, password);
ps.setString(3, email);
ps.setString(4, designation);
int x = ps.executeUpdate();
if(x != 0)
	response.sendRedirect("manager_login.html");
%>
</body>
</html>