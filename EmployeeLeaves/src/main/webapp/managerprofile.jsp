<html>
<body bgcolor = "wheat">
<%@page import="java.sql.*"%>
<table align="center" width="800",height="400" border="2">
<tr><td>Id</td><td>Name</td><td>Designation</td><td>Email</td><td>Phone</td></tr>
<%
Connection con=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
con=DriverManager.getConnection(url, user, pass);
int mid = (Integer)session.getAttribute("mid");
PreparedStatement ps = con.prepareStatement("select * from manager where mid=?");
ps.setInt(1,mid);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
 <td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %><td><%=rs.getString(4)%></td>
   <td><%=rs.getString(5)%></td>
</tr>
<%} %>
</table>
</body>
</html>