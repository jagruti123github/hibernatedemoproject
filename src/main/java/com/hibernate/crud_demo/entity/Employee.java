package com.hibernate.crud_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_id;
	private String emp_name;
	private String emp_state;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String emp_name, String emp_state) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_state = emp_state;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_state() {
		return emp_state;
	}
	public void setEmp_state(String emp_state) {
		this.emp_state = emp_state;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_state=" + emp_state + "]";
	}
		

}
