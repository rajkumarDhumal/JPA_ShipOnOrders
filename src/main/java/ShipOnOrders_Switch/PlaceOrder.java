package ShipOnOrders_Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class PlaceOrder {
	public PlaceOrder(Users users) {
		List<Items>items=new ArrayList<Items>();
		List<Orders> order=new ArrayList<Orders>();
		ShipOnOrders_Dao dao=new ShipOnOrders_Dao();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter order ID>>");
		int orderId=sc.nextInt();
		System.out.println("Enter order date>>");
		String orderDate = sc.next();
		int totalCost=0;
		Orders or=new Orders();
		or.setOrderDate(orderDate);
		or.setOrderId(orderId);
		
		dao.insertOrder(or);
		
			System.out.println("how many items \n"+">>");
			
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println("Enter item ID>>");
				int itemId=sc.nextInt();
				System.out.println("Enter item name>>");
				String itemName=sc.next();
				System.out.println("Enter cost>>");
				int itemCost=sc.nextInt();
				
				Items it=new Items();
				it.setItemCost(itemCost);
				it.setItemId(itemId);
				it.setItemName(itemName);
				items.add(it);
				
				dao.insertItems(it);
				
				totalCost += itemCost;
			}
			or.setTotalCost(totalCost);
		    or.setItems(items);
		    or.setUsers(users);
			dao.updateOrders(or);
			order.add(or);
			users.setOrder(order);
			dao.updateUsers(users);
			System.out.println("order is placed");
		}
		
	}

		
	

