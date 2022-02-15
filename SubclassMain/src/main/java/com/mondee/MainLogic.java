package com.mondee;

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
		
		CreditCard cc = new CreditCard();
		cc.setPaymentid(101);
		cc.setAmount(21000);
		cc.setCreditCardType("VISA");
		
		Cheque cq = new Cheque();
		cq.setPaymentid(102);
		cq.setAmount(22000);
		cq.setChequeType("SBI");
		
		s.save(cc);
		s.save(cq);
		
		t.commit();
		s.close();
	}

}
