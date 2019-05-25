package model;
import java.util.Date;
 
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="Item")


public class Item {
	 private String id;
	    private String name;
	    private int price;
	    public String getId() {
	        return id;
	    }
	   
	    @XmlElement
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	   
	    @XmlElement
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getPrice() {
	        return price;
	    }
	   
	    @XmlElement
	    public void setPrice(int price) {
	        this.price = price;
	    }

}
