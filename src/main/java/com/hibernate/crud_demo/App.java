package com.hibernate.crud_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println(session);

		/*
		 * Employee employee = new Employee(); employee.setEmp_name("Jagruti");
		 * employee.setEmp_state("Gujrat"); Transaction transaction =
		 * session.beginTransaction(); session.save(employee);
		 * System.out.println("Employee resister successfully");
		 * System.out.println(employee); transaction.commit();
		 */
		
		//retrieve data
		
		  Employee employee = session.get(Employee.class, 1);
		  System.out.println(employee);
		 
		/*
		 * Employee employee = session.get(Employee.class, 1);
		 * employee.setEmp_name("Jagruti Patil"); employee.setEmp_state("Maharashtra");
		 * Transaction transaction = session.beginTransaction();
		 * session.update(employee); System.out.println("Record updated successfully");
		 * transaction.commit();
		 */
		
		//delete data
		/*
		 * Employee employee = session.get(Employee.class, 1); session.delete(employee);
		 * Transaction transaction = session.beginTransaction(); transaction.commit();
		 * System.out.println("data deleted successfully");
		 */
		sessionFactory.close();

	}
}
