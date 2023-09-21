package jpa.mainrunner;

import jpa.dao.StudentDAO;
import jpa.service.StudentService;

public class SMSRunner {
	public static void main(String args[]) {
		StudentDAO studentDAO = new StudentService();
		//Create Student
		StudentService studentService = new StudentService();
		studentService.createStudent();
		//System.out.println(studentDAO.getAllStudents());
	}
}