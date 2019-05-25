package service;
import java.util.List;

import dao.ItemDAO;
import model.Item;

public class ItemService {
	 ItemDAO itemDao = new ItemDAO();
	 
	    public List<Item> getAllItem() {
	        List<Item> itemList = itemDao.getAllItems();
	        return itemList;
	    }
	 
	    public Item getItemForId(String id) {
	        Item item = itemDao.getItemForId(id);
	        return item;
	    }
	 
	    public Item createItem(Item item) {
	        Item itemResponse = itemDao.createItem(item);
	        return itemResponse;
	    }
	 
	    public Item updateItem(Item item) {
	        Item itemResponse = itemDao.updateItem(item);
	        return itemResponse;
	    }
	 
	    public Item deleteItem(String id) {
	        Item itemResponse = itemDao.deleteItem(id);
	        return itemResponse;
	    }
	 
}
