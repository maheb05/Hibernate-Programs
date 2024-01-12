package com.hibernateprograms;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Student1;


public class WhereClause {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student1.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student1 s where s.fee>=20000");
		List student = query.getResultList();
		for(Object s:student) {
			System.out.println(s);
		}
	}
}
