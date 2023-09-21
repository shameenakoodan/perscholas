package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Daointerface.ConnectionDAO;
import Daointerface.ItemDAO;
import model.Books;
import model.Customer;
import model.Item;

public class ItemDaoImpl extends ConnectionDAO implements ItemDAO{

	@Override
	public List<Item> getAllItems() {
		try {
	           Connection connection = ConnectionDAO.getConnection();
	           Statement stmt = connection.createStatement();
	           ResultSet rs = stmt.executeQuery("SELECT * FROM item");
	           List boollist = new ArrayList<>();
	           while(rs.next())
	           {
	               Item b = new Item();
	               b.setId( rs.getInt("id") );
	               b.setName( rs.getString("name") );
	               b.setPrice(rs.getDouble("price"));
	               boollist.add(b);
	           }
	           return boollist;

	       } catch (SQLException ex) {
	           ex.printStackTrace();
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	       return null;
	}

	@Override
	public void addItem(Item i) {
		try {
	          Connection con = ConnectionDAO.getConnection();
	        	  String sqlQuery = "INSERT INTO item (name,price) VALUES (?,?)";
	              PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
	              prepStmt.setString(1,  i.getName());
	              prepStmt.setDouble(2, i.getPrice());
	              int affectedRows = prepStmt.executeUpdate();
	              System.out.println(affectedRows + " row(s) affected !!");
		}
	       catch (ClassNotFoundException e)
	       {
	       } catch (SQLException throwables) {
	           throwables.printStackTrace();
	       }
	}

	@Override
	public boolean removeItemById(int id) {
		try {
	           Connection connection = ConnectionDAO.getConnection();
	           PreparedStatement ps = connection.prepareStatement("DELETE FROM item WHERE id=?");
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
