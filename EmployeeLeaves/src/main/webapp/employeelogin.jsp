   
<html>
<body bgcolor ="#aaa">
<%@page import="java.sql.*"%>
<%
Connection con= null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
con=DriverManager.getConnection(url, user, pass);
String username = request.getParameter("user");
String password = request.getParameter("pass");
String sql = "select * from employee where ename=? and password=?";
ps = con.prepareStatement(sql);
ps.setString(1, username);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next())
	session.setAttribute("eid",rs.getInt(1));
	response.sendRedirect("employee_home.html");
%>
<h1>Login Successfully</h1>
</body>
</html>