package com.hibernateprograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Student1;

public class UpdateMultipleRecords {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student1.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update Student1 s set s.fee=28000 where s.id=2");
		int i = query.executeUpdate();
		System.out.println("rows Updated:"+i);
		transaction.commit();
	}
}
