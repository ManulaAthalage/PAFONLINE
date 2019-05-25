package dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
import model.Item;
 


public class ItemDAO {
	static HashMap<String, Item> itemsMap = new HashMap<String, Item>();
	 
    public ItemDAO() {
            Item item1 = new Item();
            item1.setId("1");
            item1.setPrice(200);
            item1.setName("Milk");
           
            Item item2 = new Item();
            item2.setId("1");
            item2.setPrice(500);
            item2.setName("Chocolate");
           
            itemsMap.put("1", item1);
            itemsMap.put("2", item2);
    }
 
    public List<Item> getAllItems() {
 
        List<Item> userList = new ArrayList<Item>(itemsMap.values());
        return userList;
    }
 
    public Item getItemForId(String id) {
        Item item = itemsMap.get(id);
        return item;
    }
 
    public Item createItem(Item item) {
    	itemsMap.put(item.getId(), item);
        return itemsMap.get(item.getId());
    }
 
    public Item updateItem(Item item) {
        Item existingItem= itemsMap.get(item.getId());
        if (existingItem != null) {
            existingItem.setName(item.getName());
            existingItem.setPrice(item.getPrice());
        } else {
            itemsMap.put(item.getId(), item);
        }
        return itemsMap.get(item.getId());
    }
 
    public Item deleteItem(String id) {
    	Item itemResponse = itemsMap.remove(id);
        return itemResponse;
    }

}
