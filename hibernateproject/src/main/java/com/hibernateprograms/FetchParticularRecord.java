package com.hibernateprograms;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Student1;

public class FetchParticularRecord {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student1.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student1 s = session.get(Student1.class,2);
		System.out.println("Here are the details");
		System.out.println(s);
		transaction.commit();
	}
}
