<%@page import="java.sql.*"%>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/mondee";
	     String user="root";
	     String pass="1234";
	   con=DriverManager.getConnection(url, user, pass);
	   String pname=request.getParameter("pname");
	   String doa=request.getParameter("doa");
	   String toa=request.getParameter("toa");
	   String specialist=request.getParameter("spectialist");
	     String sql="insert into appointment(pid,pname,dname,doa,toa,specialist,status) values(?,?,?,?,?,?,?)";
	    int pid=(Integer)session.getAttribute("pid");
	     PreparedStatement ps=con.prepareStatement(sql);
	   ps.setInt(1, pid);  
	   ps.setString(2, pname);
	   ps.setString(3, "None");
	   ps.setString(4, doa); 
	   ps.setString(5, toa);
	   ps.setString(6, specialist);
	   ps.setString(7, "pending");
	   int x=ps.executeUpdate();
	   if(x!=0)
		   response.sendRedirect("appointment_applied.jsp");
	 %>  