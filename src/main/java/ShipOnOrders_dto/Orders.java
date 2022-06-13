package ShipOnOrders_dto;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Orders {
	@Id
	private int orderId;
	private int totalCost;
	private String orderDate;
	@ManyToOne
	private Users users;
	
	@ManyToMany
	private List<Items> items;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", totalCost=" + totalCost + ", orderDate=" + orderDate + ", users="
				+ users + ", items=" + items + "]";
	}
	
	
	
	

}
