<html>
<body>
   <h1 align="center">Welcome to Doctor Home<br><br>
     <a href="doctorprofile.jsp">Doctor Profile</a>
     <a href="index.html">Logout</a>
   </h1><br><br>
     <%@page import="java.sql.*"%>
     <table border="2" width="400" height="200" align="center">
     <tr><td>id</td> <td>Patient Name</td><td>Date</td><td>Time</td><td>specialist</td><td>Action</td></tr>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/mondee";
	     String user="root";
	     String pass="1234";
	   con=DriverManager.getConnection(url, user, pass);
	   String specialist=(String)session .getAttribute("specialist"); 
	   PreparedStatement ps=con.prepareStatement("select * from appointment where specialist=?");
	    ps.setString(1, specialist);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	    	%>
	    	<tr>
	    	  <td><%=rs.getInt(1) %></td><td> <%=rs.getString("pname") %></td><td> <%=rs.getString("doa")%></td><td><%=rs.getInt("toa")%></td><td><%=rs.getString("specialist")%></td><td><%=rs.getString("status")%></td>
	    	    <td><a href="accept.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
	    	</tr>
          <% }%>
    </table>
</body>
</html>
