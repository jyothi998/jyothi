<html>
<body>
   <h1 align="center">Welcome to Doctor Home<br><br>
     <a href="doctorprofile.jsp">Doctor Profile</a>
     <a href="index.html">Logout</a>
   </h1><br><br>
     <%@page import="java.sql.*"%>
     <table border="2" width="400" height="200" align="center">
     <tr><td>id</td> <td>Name</td><td>email</td><td>phone</td><td>specialist</td></tr>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/mondee";
	     String user="root";
	     String pass="1234";
	   con=DriverManager.getConnection(url, user, pass);
	     int id=(Integer)session.getAttribute("id");
	   PreparedStatement ps=con.prepareStatement("select * from doctor where id=?");
	    ps.setInt(1, id);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	    	%>
	    	<tr>
	    	  <td><%=rs.getInt(1) %></td><td> <%=rs.getString(2) %></td><td> <%=rs.getString(3)%></td><td><%=rs.getString(5)%></td>
	    	</tr>
          <% }%>
    </table>
</body>
</html>