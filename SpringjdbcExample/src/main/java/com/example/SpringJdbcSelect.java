package com.example;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcSelect {
//JdbcTemplate jt;//comming from spring.xml
//
//public void setJt(JdbcTemplate jt) {
//	this.jt = jt;
//}
//public void insert() {
//	jt.execute("insert into student values(173,'sonu',23)");
//}
//public void selectEx() {
//List l =jt.queryForList("select * from student");
//Iterator i=l.iterator();
//while(i.hasNext()) {
//	System.out.println(i.next());//printing the object
//}
//}
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
public void selectEx() {
	Session se = sessionFactory.openSession();
	Query q =se.createQuery("from student s");
	List l = q.list();
	Iterator i = l. iterator();
	while(i.hasNext()) {
		Student x =(Student)i.next();
		System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSage());
	}
}	
}
