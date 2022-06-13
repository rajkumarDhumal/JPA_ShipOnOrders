package ShipOnOrders_Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class Signup {
	public Signup() {
		List<Items>item=new ArrayList<Items>();
		List<Orders>order=new ArrayList<Orders>();
		ShipOnOrders_Dao dao=new ShipOnOrders_Dao();

		Scanner sc=new Scanner(System.in);

		System.out.println("********SIGNUP********");
		System.out.print("name>>");
		String userName=sc.next();
		System.out.print("Password>>");
		String password=sc.next();
		System.out.print("user ID>>");
		int userId=sc.nextInt();
		System.out.print("address>>");
		String add=sc.next();
		System.out.print("Phone no>>");
		int phoneNo=sc.nextInt();
		
		Users u=new Users();
		u.setUserId(userId);
		u.setAddress(add);
		u.setPassword(password);
		u.setPhoneNo(phoneNo);
		u.setUserName(userName);
		
	
		dao.insertUser(u);
		
		
		
		
	}

}
