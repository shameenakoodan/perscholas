package com.shameenakoodan.HibernateJPABeginner.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shameenakoodan.HibernateJPABeginner.model.Department;

public class CreateDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Department deptDepartment1 = new Department();
		deptDepartment1.setName("Account");
		deptDepartment1.setState("TX");
		
		Department deptDepartment2 = new Department();
		deptDepartment2.setName("Finance");
		deptDepartment2.setState("MN");
		
		Department deptDepartment3 = new Department();
		deptDepartment3.setName("IT");
		deptDepartment3.setState("CA");
		
		session.persist(deptDepartment1);
		session.persist(deptDepartment2);
		session.persist(deptDepartment3);
		t.commit();
		
		System.out.println("successfully created Department table");
		factory.close();
		session.close();

	}

}
