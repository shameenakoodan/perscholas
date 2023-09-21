package Daointerface;

import java.util.List;

import model.Customer;
import model.Item;

public interface ItemDAO {
	 List<Item> getAllItems();
	 void addItem(Item i);
	 boolean removeItemById(int id);
}
