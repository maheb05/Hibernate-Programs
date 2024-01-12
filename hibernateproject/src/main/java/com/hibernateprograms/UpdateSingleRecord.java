package com.hibernateprograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student1;

public class UpdateSingleRecord {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student1.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student1 s = session.get(Student1.class, 2);
		s.setFee(28500);
		transaction.commit();
		
	}
}
