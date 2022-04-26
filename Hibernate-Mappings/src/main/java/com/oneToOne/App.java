package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java ?");
		
		Question q2 = new Question();
		q2.setQuestionId(1243);
		q2.setQuestion("what is python ?");
		
		Answers answer1 = new Answers();
		answer1.setAnswerId(343);
		answer1.setAnswer("Java is programming langauge");
		answer1.setQuestion(q1);
		
		Answers answer2 = new Answers();
		answer2.setAnswerId(33);
		answer2.setAnswer("With the help of java we can create softwares");
		answer2.setQuestion(q2);
		
		q1.setAnswers(answer1);
		q2.setAnswers(answer2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(answer1);
		session.save(answer2);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
