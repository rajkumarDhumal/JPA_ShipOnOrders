package ShipOnOrders_dto;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Items {
	@Id
	private int itemId;
	private String itemName;
	private int itemCost;
	
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}
	
	
	

}
