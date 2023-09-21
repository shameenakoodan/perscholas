package org.shameenakoodan.DemoNamedQueries;

import com.shameenakoodan.DemoNamedQueries.controller.EmployeController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		EmployeController e = new EmployeController();
		// e.createEmployeeTable();
		e.findEmployeeByname();
		e.findEmployeeById();
		e.ShowOfficeCodes_AsDepartment();
	}
}
