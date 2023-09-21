package Runner;
import Controller.BookDaoImpl;
import Controller.CustomerDaoImpl;
import Controller.ItemDaoImpl;
import Daointerface.*;
import model.Books;
import model.Customer;
import model.Item;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccessBook {
	 public static void main(String[] args) {

	       // creating object
	       BookDao bookDao = new BookDaoImpl();
	       /*System.out.println("--------- inserting book records ----------");
	     
	       ArrayList<Books> BookList = new ArrayList<Books>();

	       Books b1 = new Books();
	       b1.setIsbn(120);
	       b1.setBookName("Java Book");
	       BookList.add(b1);
	       Books b2 = new Books();
	       b2.setIsbn(300);
	       b2.setBookName("Python Book");
	       BookList.add(b2);

	       Books b3 = new Books();
	       b3.setIsbn(365);
	       b3.setBookName("JavaScript Book");
	       BookList.add(b3);

	       Books b4 = new Books();
	       b4.setIsbn(256);
	       b4.setBookName("SQL Book");
	       BookList.add(b4);

	       bookDao.saveBook(BookList);*/
	       
	       //Retrieve Books
	       System.out.println( " ====== Display list of all books ====");
	       try {
	          for (Books cc : bookDao.getAllBooks()) {
	            int ISBN = cc.getIsbn();
	              String BookName = cc.getBookName();
	              System.out.println("======================");
	              System.out.println("ISBN Number :" + ISBN + "and Book name: " + BookName);

	          }
	       } catch (ClassNotFoundException e) {
	          e.printStackTrace();
	       } catch (SQLException e) {
	          e.printStackTrace();
	       }
	       
	       //Update Book record
	       System.out.println("----Book information is updating -----");
	       Books Bookupdating = new Books();
	       Bookupdating.setIsbn(3);
	       Bookupdating.setBookName("Algorithms Book");
	       boolean result = bookDao.updateBook(Bookupdating, 3);
	       System.out.println(result);

	       //Delete Book record by id
	       boolean a = bookDao.deleteBook(4); // 4 is a id of book
	       if(a == true) {
	              System.out.println("Record is deleted");
	       }
	       else
	       {
	              System.out.println("Record is not deleted");
	       }

	       //Get customer By ID
	       System.out.println("Get customer details by Id");
	       CustomerDAO customerDAO = new CustomerDaoImpl();
	       Customer customer = customerDAO.getCustomerById(1);
	       System.out.println("Customer Id : " + customer.getId());
	       System.out.println("First Name : "+customer.getFname());
	       System.out.println("Last Name : "+customer.getLname());
	       System.out.println("Email : "+customer.getEmail());
	       
	       //Adding customers
	       ArrayList<Customer> CustomerList = new ArrayList<Customer>();
	       System.out.println("**********************Add customers**********************");

	       Customer c1 = new Customer();
	       c1.setEmail("abc@gmail.com");
	       c1.setFname("Sean");
	       c1.setLname("Corbett");
	       CustomerList.add(c1);
	       
	       Customer c2 = new Customer();
	       c2.setEmail("ruby@gmail.com");
	       c2.setFname("Ruby");
	       c2.setLname("Chacko");
	       CustomerList.add(c2);

	       Customer c3 = new Customer();
	       c3.setEmail("ezra@gmail.com");
	       c3.setFname("Ezra");
	       c3.setLname("Williams");
	       CustomerList.add(c3);

	       Customer c4 = new Customer();
	       c4.setEmail("safa@gmail.com");
	       c4.setFname("Safaa");
	       c4.setLname("esallehi");
	       CustomerList.add(c4);

	       customerDAO.addCustomer(CustomerList);
	       
	       //Delete a customer by id
	       System.out.println("**********************Remove a customer**********************");
	       boolean c = customerDAO.removeCustomerById(4); // 4 is a id of book
	       if(c == true) {
	              System.out.println("Record is deleted");
	       }
	       else
	       {
	              System.out.println("Record is not deleted");
	       }
	       
	       //Adding Items
	       System.out.println("**********************Add items**********************");
	       ItemDAO itemDAO = new ItemDaoImpl();
	       Item i = new Item();
	       i.setName("Ball");
	       i.setPrice(20.2);
	       itemDAO.addItem(i);
	       
	       //Delete Item 
	       System.out.println("**********************Delete an item**********************");
	       if(itemDAO.removeItemById(1))
	    	   System.out.println("Item Deleted!!!");
	       else {
			System.out.println("Item not deleted!!!");
		}
	       
	     //Get all items
	       System.out.println("**********************List all the items**********************");
	     List<Item> resultItems =  itemDAO.getAllItems();
	     for(Item item:resultItems) {
	    	 System.out.println("Id	:" + item.getId());
	    	 System.out.println("Name :"+item.getName());
	    	 System.out.println("Price :"+item.getPrice());
	     }
	 }
}
