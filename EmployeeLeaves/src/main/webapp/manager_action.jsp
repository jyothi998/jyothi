<html>
<body bgcolor ="wheat">
<%@page import="java.sql.*"%>
<%
Connection con= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
String user="root";
String pass="1234";
con=DriverManager.getConnection(url, user, pass);
int eid = (Integer)session.getAttribute("eid");
PreparedStatement p = con.prepareStatement("select * from leaves where eid=?");
p.setInt(1,eid);
ResultSet rs = p.executeQuery();
String id = request.getParameter("id");
int aid = Integer.parseInt(id);
PreparedStatement ps = con.prepareStatement("update leaves set status=? where id=?");
if(rs.next()){
	if(rs.getInt("totalleaves") <= 20){
		ps.setString(1,"Accepted");
	}
	else{
		ps.setString(1,"Leaves not sufficient");
	}
}
ps.setInt(2,aid);
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("viewapplicants.jsp");
}
%>

</html>