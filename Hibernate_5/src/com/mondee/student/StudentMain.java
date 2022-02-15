package com.mondee.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StudentMain {
public static void main(String[] args) {
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.xml").build();
	Metadata m = new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf=m.getSessionFactoryBuilder().build();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			Student obj = new Student();
			obj.setSid(122);
			obj.setSname("teja");
			obj.setSage(22);
			s.save(obj);
			t.commit();
			s.close();
}
}
