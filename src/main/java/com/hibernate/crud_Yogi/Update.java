package com.hibernate.crud_Yogi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

public class Update {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 1);
		employee.setEmp_name("Yogeshwari Mane"); 
		Transaction transaction = session.beginTransaction();
		session.update(employee); System.out.println("Record updated successfully");
		transaction.commit();
		
		sessionFactory.close();
	}
}
