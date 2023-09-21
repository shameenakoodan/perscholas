package com.shameenakoodan.LoginHibernateDemo.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.shameenakoodan.LoginHibernateDemo.model.User;

import jakarta.persistence.TypedQuery;

public class LoginController {
	public boolean login(String email, String password) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User u where u.email = :email and u.password = :password"; // Example of HQL to get all records of user class
		Query<User> query = session.createQuery(hql, User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		List<User> results = query.getResultList();
		if(results.size()>0) {
			
			return true;
		}
		else {
			return false;
		}
	}
	public void createTable() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User uone = new User();
		uone.setAddress("XYZ lane");
		uone.setEmail("haseeb@gmail.com");
		uone.setName("Moh Haseeb");
		uone.setPassword("has123");
		
		uone.setState("TX");
		uone.setZipcode("75068");
		session.persist(uone);
		t.commit();
		System.out.println("successfully created user table");
		factory.close();
		session.close();
	}
	public User findByEmail(String email) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction  = session.beginTransaction();
		String hqlString = "From User u where u.email = :email";
		TypedQuery<User> query = session.createQuery(hqlString,User.class);
		query.setParameter("email", email);
		User resultUser = query.getSingleResult();
		return resultUser;
	}
	public List<User> findUsersByZipcode(String zipcode){
		List<User> result;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlString = "FROM user u where u.zipcode = :zipcode";
		TypedQuery<User> typedQuery = session.createQuery(hqlString,User.class);
		typedQuery.setParameter("zipcode", zipcode);
		result = typedQuery.getResultList();
		return result;
	}
}
