package com.mondee.student;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentMain {
public static void main(String[] args) {
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.xml").build();
	Metadata m = new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf=m.getSessionFactoryBuilder().build();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			Query q = s.createQuery("from Student s");
		List l = q.list();
			Iterator i = l. iterator();
			while(i.hasNext()) {
				Student x =(Student)i.next();
				System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSage());
			}
			
			t.commit();
			s.close();
}
}
