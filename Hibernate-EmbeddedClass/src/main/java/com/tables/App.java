package com.tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Students sc = new Students();
		sc.setFname("John");
		sc.setLname("Bird");
		
		Address ad = new Address();
		ad.setCountry("Ind");
		ad.setState("Maha");
		ad.setCity("Pune");
		sc.setAds(ad);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sc);
		tx.commit();
		session.close();
		factory.close();
	}

}
