package com.shameenakoodan.HibernateJPABeginner.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shameenakoodan.HibernateJPABeginner.model.Department;
import com.shameenakoodan.HibernateJPABeginner.model.User;

public class DeletingDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department department = new Department();
		department.setDid(3);
	    session.remove(department);
	    tx.commit();
	    session.close();
	    factory.close();
	}

}
