package com.mondee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainLogic {

	public static void main(String[] args) {
	
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.xml").build();
		Metadata m = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf =m.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Vendor v = new Vendor();
		v.setVendorid(101);
		v.setVendorname("Amazon");
		
		Customer c = new Customer();
		c.setCustomerid(201);
		c.setCustomername("jyothi");
		
		Customer c1 = new Customer();
		c1.setCustomerid(202);
		c1.setCustomername("ramya");
		
		Set se=new HashSet();
		se.add(c);
		se.add(c1);
		
		v.setObj(se);
		
		t.commit();
		s.close();
	}

}
