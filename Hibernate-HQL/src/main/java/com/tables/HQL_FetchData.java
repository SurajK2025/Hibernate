package com.tables;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_FetchData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//Query 1
		String query1 = "from Students";
		Query q1 = session.createQuery(query1);
		
		List<Students> list1 = q1.list();
		for(Students std : list1) {
			System.out.println(std);
		}
		
		//Query 2
		String query2 = "from Students where address = 'Khopoli'";
		Query q2 = session.createQuery(query2);
		
		List<Students> list2 = q2.list();
		for(Students std : list2) {
			System.out.println(std);
		}
		
		//Query 3
		String query3 = "from Students where address =: x";
		Query q3 = session.createQuery(query3);
		q3.setParameter("x", "Khopoli");
				
		List<Students> list3 = q3.list();
		for(Students std : list3) {
			System.out.println(std);
		}
		
		//Query 4
		String query4 = "from Students where address =: x and fname =: y";
		Query q4 = session.createQuery(query4);
		q4.setParameter("x", "Khopoli");
		q4.setParameter("y", "Shivam");
				
		List<Students> list4 = q4.list();
		for(Students std : list4) {
			System.out.println(std);
		}
		
		session.close();
		factory.close();
	}

}
