package loop_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Connection_Example {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondee","root","1234");
	if(c!=null) {
		System.out.println("Connection Sucessful");
	}
	else {
		System.out.println("Connection failes");
	}
String data="insert into Student values(222,'Ram','hyderabad',22)";
Statement s = c.createStatement();
s.execute(data);
System.out.println("selected sucessfully");
c.close();

}
}
