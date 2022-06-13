package ShipOnOrders_dto;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	private int userId;
	@Id
	private String userName;
	private String password;
	private String address;
	private long phoneNo;
	
	
	@OneToMany
	private List<Orders> order;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", address=" + address
				+ ", phoneNo=" + phoneNo + ", order=" + order + "]";
	}
	
	
	

	
	
	


}
