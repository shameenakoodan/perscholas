import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailsDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	       String dburl = "jdbc:mysql://localhost:3306/classicmodels";
	       String user = "root";
	       String password = "password";
			Connection con = DriverManager.getConnection(dburl, user , password );
			
			//Select all employees whose officecode is 1 and 4.
			String SelectSQL = "Select *from employees where officecode=? or officecode = ?";
			PreparedStatement mystmt = con.prepareStatement(SelectSQL);
			mystmt.setInt(1, 1);
			mystmt.setInt(2, 4);
			ResultSet result = mystmt.executeQuery();
			while(result.next())
	           {
	              String EmployeeID  = result.getString("employeeNumber");
	              String fname = result.getString("firstName");
	              String lname  = result.getString("lastName");
	              String officeCodeString = result.getString("officecode");
	              System.out.println(EmployeeID +" | " + fname + "|"+ lname+ " | "+ officeCodeString);
	           }
			
			
			//Select all orderdetails whose orderNumber is 10100 and 10102.
			System.out.println();
			SelectSQL = "Select *from orderdetails where orderNumber=? or orderNumber = ?";
			mystmt = con.prepareStatement(SelectSQL);
			mystmt.setInt(1, 10100);
			mystmt.setInt(2, 10102);
			result = mystmt.executeQuery();
			while(result.next())
	           {
	              String orderNumber  = result.getString("orderNumber");
	              String productCode = result.getString("productCode");
	              String quantityOrdered  = result.getString("quantityOrdered");
	              String priceEach = result.getString("priceEach");
	              String orderLineNumber = result.getString("orderLineNumber");
	              System.out.println(orderNumber +" | " + productCode + "|"+ quantityOrdered+ " | "+ priceEach+ " | "+orderLineNumber);
	           }
			
			//Update the extension number of employees whose officecode is 2, and the new extension number will be “5698.” 
			System.out.println();
			SelectSQL = "Update employees set extension=? where officecode=?";
			mystmt = con.prepareStatement(SelectSQL);
			mystmt.setInt(1, 5698);
			mystmt.setInt(2, 2);
			mystmt.executeUpdate();
			
			//Select all employees whose last name is less than five characters in length.
			SelectSQL = "Select *from employees where length(lastname)<?";
			 mystmt = con.prepareStatement(SelectSQL);
			mystmt.setInt(1, 5);

			 result = mystmt.executeQuery();
			while(result.next())
	           {
	              String EmployeeID  = result.getString("employeeNumber");
	              String fname = result.getString("firstName");
	              String lname  = result.getString("lastName");
	              String officeCodeString = result.getString("officecode");
	              System.out.println(EmployeeID +" | " + fname + "|"+ lname+ " | "+ officeCodeString);
	           }
			
	   }
}
/*
*/