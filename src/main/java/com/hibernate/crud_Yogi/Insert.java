package com.hibernate.crud_Yogi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

public class Insert {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = new Employee(); employee.setEmp_name("Yogeshwari");
		employee.setEmp_state("Maharashtra"); 
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		System.out.println("Employee resister successfully");
		System.out.println(employee); 
		transaction.commit();
		
		sessionFactory.close();
	}
}
