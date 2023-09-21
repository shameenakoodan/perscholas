import java.sql.PreparedStatement;
import java.sql.*;

public class UpdateDemo {
	public static void main (String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url =  "jdbc:mysql://localhost:3306/classicmodels"; 
		final String USER = "root";
		final String PASS = "password";
		Connection con = DriverManager.getConnection(url, USER , PASS );
		String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
		String SelectSQL = "update employees set firstName=? , lastName=? where employeeNumber=?";
		PreparedStatement mystmt = con.prepareStatement(SelectSQL);
		mystmt.setString(1, "Gary");
		mystmt.setString(2, "Larson");
		mystmt.setLong  (3, 1002);
		mystmt.executeUpdate();


	}

}
