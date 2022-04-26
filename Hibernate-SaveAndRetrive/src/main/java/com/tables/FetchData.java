package com.tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Students students1 = (Students) session.load(Students.class, 1);
		Students students2 = (Students) session.get(Students.class, 2);
		
		System.out.println(students1);
		System.out.println(students2);
		
		session.close();
		factory.close(); 
	}
}