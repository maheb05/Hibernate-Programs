package com.hibernateprograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Student1;

public class DeleteMultipleRows {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student1.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from Student1 s where s.fee<=18000");
		int i = query.executeUpdate();
		System.out.println(i);
		transaction.commit();
	}
}
