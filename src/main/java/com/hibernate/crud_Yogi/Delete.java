package com.hibernate.crud_Yogi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

public class Delete {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println(session);
		
		Employee employee = session.get(Employee.class, 1); 
		session.delete(employee);
		Transaction transaction = session.beginTransaction(); 
		transaction.commit();
		System.out.println("data deleted successfully");
		
		sessionFactory.close();
	}
}
