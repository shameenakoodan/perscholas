package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import jakarta.persistence.TypedQuery;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	public List<Student> getAllStudents() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		String hqlString = "From Student s";
		TypedQuery<Student> query = session.createQuery(hqlString, Student.class);
		List<Student> studentList = query.getResultList();
		return studentList;
	}

	public Student getStudentByEmail() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		return null;
	}

	public boolean validateStudent() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean registerStudentToCourse() {
		
		return false;
	}

	/*public Course getStudentCourses() {
		// TODO Auto-generated method stub
		return null;
	}*/
	public void createStudent() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student student = new Student();
		student.setsEmail("john@gmail.com");
		student.setsName("John");
		student.setsPass("password");
		session.persist(student);
		t.commit();
		System.out.println("successfully created user table");
		factory.close();
		session.close();
	}
}
