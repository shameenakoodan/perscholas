package com.shameenakoodan.HibernateJPABeginner.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shameenakoodan.HibernateJPABeginner.model.Department;
import com.shameenakoodan.HibernateJPABeginner.model.User;

public class UpdateDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department deptDepartment= new Department();
		deptDepartment.setDid(3);
		deptDepartment.setName("Technical");
		deptDepartment.setState("NY");
		
		session.merge(deptDepartment);
		session.getTransaction().commit();
		session.close();
	}

}
