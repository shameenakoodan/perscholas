package Daointerface;

import java.util.List;

import model.Customer;

public interface CustomerDAO {
	Customer getCustomerById(int id) ;
	void addCustomer(List<Customer> customerList);
	boolean removeCustomerById(int id);
}
