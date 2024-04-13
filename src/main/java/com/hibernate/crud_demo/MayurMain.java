package com.hibernate.crud_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud_demo.entity.Employee;

public class MayurMain {

	public void createEmp() {
		System.out.println("CREATE OPERATION");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = new Employee();
		emp.setEmp_name("Mayur Patil");
		emp.setEmp_state("MH");
		s.save(emp);
		t.commit();
		sf.close();
		System.out.println("Create Operation Successful");
	}
	
	public void updateEmp() {
		System.out.println("UPDATE OPERATION");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = s.get(Employee.class, 8);
		emp.setEmp_name("Mayur Patil");
		emp.setEmp_state("MH-19");
		s.update(emp);
		t.commit();
		sf.close();
		System.out.println("Update Operation Successful");
	}
	
	public void deleteEmp() {
		System.out.println("DELETE OPERATION");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = s.get(Employee.class, 8);
		s.delete(emp);
		t.commit();
		sf.close();
		System.out.println("Delete Operation Successful");
	}
	
	public void readEmp() {
		System.out.println("RETRIVE OPERATION");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employee emp = s.get(Employee.class, 1);
		System.out.println("Retrive employee => "+ emp);
		System.out.println("Retrive Operation Successful");
		sf.close();
	}

	public static void main(String[] args) {
		
		MayurMain mm = new MayurMain();		
		mm.createEmp();
		mm.updateEmp();
		mm.readEmp();
		mm.deleteEmp();

	}

}
