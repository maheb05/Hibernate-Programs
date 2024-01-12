package com.hibernateprograms;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student1;


public class InsertIntoTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student1.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter your details :");
		
		System.out.println("Enter ID:");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Name:");
		String name = scan.nextLine();
		
		System.out.println("Enter Email:");
		String email = scan.next();
		
		System.out.println("Enter Branch:");
		String branch = scan.next();
		
		System.out.println("Enter Fee:");
		int fee = scan.nextInt();
		
		
		Student1 s1 = new Student1(id,name,email,branch,fee);
		session.save(s1);
		transaction.commit();
		
		
	}
}
