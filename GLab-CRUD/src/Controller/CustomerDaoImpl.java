package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Daointerface.ConnectionDAO;
import Daointerface.CustomerDAO;
import model.Books;
import model.Customer;

public class CustomerDaoImpl extends ConnectionDAO implements CustomerDAO{

	@Override
	public Customer getCustomerById(int id) {
		try {
	           Connection connection = ConnectionDAO.getConnection();
	           PreparedStatement ps = connection.prepareStatement("Select *FROM customer WHERE id=?");
	           ps.setInt(1, id);
	           ResultSet resultSet = ps.executeQuery();
	           resultSet.next();
	           Customer customer = new Customer();
	           customer.setId( resultSet.getInt("id") );
	           customer.setEmail( resultSet.getString("email") );
	           customer.setFname(resultSet.getString("fname"));
	           customer.setLname(resultSet.getString("lname"));
	           return customer;
	       } catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException ex) {
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       }
		return null;
	}

	@Override
	public void addCustomer(List<Customer> CustomerList) {
		try {
	          Connection con = ConnectionDAO.getConnection();
	          for(Customer b: CustomerList) {
	        	  String sqlQuery = "INSERT INTO customer (email,fname,lname) VALUES (?,?,?)";
	              PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
	              prepStmt.setString(1,  b.getEmail());
	              prepStmt.setString(2, b.getFname());
	              prepStmt.setString(3, b.getLname());
	              int affectedRows = prepStmt.executeUpdate();
	              System.out.println(affectedRows + " row(s) affected !!");
	          }
		}
	       catch (ClassNotFoundException e)
	       {
	       } catch (SQLException throwables) {
	           throwables.printStackTrace();
	       }
	}

	@Override
	public boolean removeCustomerById(int id) {
		try {
	           Connection connection = ConnectionDAO.getConnection();
	           PreparedStatement ps = connection.prepareStatement("DELETE FROM customer WHERE id=?");
	           ps.setInt(1, id);
	           int i = ps.executeUpdate();
	           if(i == 1) {
	               return true;
	           }
	       } catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException ex) {
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       }
	       return false;
	}

}
