package com.hibernate.crud_Yogi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

public class Retrieve {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);
		
		sessionFactory.close();
	}
}
