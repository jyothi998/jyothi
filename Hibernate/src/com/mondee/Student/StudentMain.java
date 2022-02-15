package com.mondee.Student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student obj = new Student();
		obj.setSid(123);
		obj.setSname("jyothi");
		obj.setSage(22);
	}

}
