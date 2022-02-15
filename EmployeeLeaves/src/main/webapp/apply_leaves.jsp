<html>
<body bgcolor="wheat">

	<%@page import="java.sql.*"%>
	<%@page import="java.text.DateFormat"%>
	<%@page import="java.util.Date"%>
	<%@page import="java.text.SimpleDateFormat"%>
	<%@page import="java.util.Calendar"%>

	<%
	Connection con= null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/mondee";
	String user="root";
	String pass="1234";
	con=DriverManager.getConnection(url, user, pass);
	String date1 = request.getParameter("fromDate");
	String date2 = request.getParameter("toDate");
	String name = request.getParameter("ename");
	String designation = request.getParameter("designation");
	
	SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date fromDate = myFormat.parse(date1);
	Date toDate = myFormat.parse(date2);
	int noOfDays = (int) ((toDate.getTime() - fromDate.getTime()) / (1000 * 60 * 60 * 24));
	
	Date date = new Date();
	int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
	
	//out.println("current year " + noOfDays);
	int eid = (Integer)session.getAttribute("eid");
	PreparedStatement p = con.prepareStatement("select sum(noofleaves) from leaves where eid=? and year(fromDate) = ? and year(toDate) = ?");
	p.setInt(1,eid);
	p.setInt(2,year);
	p.setInt(3,year);
	ResultSet rs = p.executeQuery();
	int noOfLeaves = noOfDays+1;
	int totalLeaves = 0;
	if(rs.next()){
		 totalLeaves = noOfLeaves+(rs.getInt(1));
	}
		//	+(rs.getInt("noofleaves"));
	String sql = "insert into leaves(eid,ename,mname,fromdate,todate,noofleaves,status,totalleaves)values(?,?,?,?,?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, eid);
	ps.setString(2, name);
	ps.setString(3, designation);
	ps.setString(4, date1);
	ps.setString(5, date2);
	ps.setInt(6, noOfLeaves);
	ps.setString(7, "Pending");
	ps.setInt(8, totalLeaves);
	
	if ((noOfDays + 1) <= 3) {
		int x = ps.executeUpdate();
		if (x != 0) {
			response.sendRedirect("employee_homepage.html");
		}
	} else {
		out.println("should not take leaves more than 3days at a time");
	}
	%>
</body>
</html>