package jpa.dao;

import java.util.List;

import jpa.entitymodels.Student;

public interface StudentDAO {
	List<Student> getAllStudents();
	Student getStudentByEmail();
	boolean validateStudent();
	boolean registerStudentToCourse();
	//Course getStudentCourses();
}
