package com.shameenakoodan.HibernateJPABeginner.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shameenakoodan.HibernateJPABeginner.model.Department;
import com.shameenakoodan.HibernateJPABeginner.model.User;

public class FindDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int DEPARTMENT_ID = 2;
		Department department = session.get(Department.class, DEPARTMENT_ID);
		System.out.println("Name: " + department.getName());
		System.out.println("State: " + department.getState());

		// Close resources
		tx.commit();
		factory.close();
		session.close();

	}

}
