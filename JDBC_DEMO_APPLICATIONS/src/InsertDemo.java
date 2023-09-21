import java.sql.PreparedStatement;
import java.sql.*;

public class InsertDemo {
	public static void main (String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url =  "jdbc:mysql://localhost:3306/classicmodels"; 
		final String USER = "root";
		final String PASS = "password";
		Connection con = DriverManager.getConnection(url, USER , PASS );
		String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
		prepStmt = con.prepareStatement(sqlQuery);
		prepStmt.setInt(1, 6);
		prepStmt.setString(2, "Jamil");
		prepStmt.setString(3, "fink");
		prepStmt.setString(4, "JJ@gmail.com");
		prepStmt.setString(5, "2759");
		prepStmt.setInt(6, 1143);
		prepStmt.setInt(7, 9);
		prepStmt.setInt(8, 0005);
		prepStmt.setString(9, "Manager");
		int affectedRows = prepStmt.executeUpdate();
		System.out.println(affectedRows + " row(s) affected !!");


	}

}
