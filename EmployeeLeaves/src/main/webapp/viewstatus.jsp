<html>
<body bgcolor = "wheat">
<br><br><br>
<h1 align="center"><a href="apply_appointment.jsp">Apply Appointment</a></h1>
<h1 align="center"><a href="appointment_applied.jsp">View Appointment</a></h1>
<h1 align="center"><a href="index.html">LOGOUT</a></h1>
<br><br><br>
<%@page import="java.sql.*"%>
<table align="center" width="800",height="400" border="2">
<tr><td>Id</td><td>EmployeeName</td><td>FromDate</td><td>ToDate</td><td>Designation</td><td>Status</td></tr>
<%
Connection con = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
String dept = (String)session.getAttribute("designation");
int id = (Integer)session.getAttribute("eid");
PreparedStatement ps = con.prepareStatement("select * from leaves where eid = ?");
ps.setInt(1,id);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td><td><%=rs.getString("ename") %><td><%=rs.getString("mname")%></td>
<td><%=rs.getString("fromdate") %></td><td><%=rs.getString("todate")%></td><td><%=rs.getString("status") %></td>
</tr>
<%} %>
</table>
</body>
</html>