package com.tables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData_Main {

	public static void main(String[] args) throws IOException {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("Factory object "+factory);
		
		Students s = new Students();
		s.setName("Alex");
		s.setCity("Bird");
		System.out.println(s);
		
		FileInputStream fs = new FileInputStream("src/main/resources/Images/joey.jpg");
		byte[] img = new byte[fs.available()];
		fs.read(img);
		
		
		Address ad = new Address();
		ad.setStreet("Katrang");
		ad.setCity("Khp");
		ad.setOpen(true);
		ad.setX(347924);
		ad.setAddedDate(new Date());
		ad.setImage(img);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		//session.save(ad);
		tx.commit();
		session.close();
		factory.close();

	}

}
