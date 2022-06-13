package ShipOnOrders_Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class UpdateItem {
	public UpdateItem(Users users) {
		List<Items>items=new ArrayList<Items>();

		Scanner sc=new Scanner(System.in);
		ShipOnOrders_Dao dao=new ShipOnOrders_Dao();
		
		new ShowOrder(users);
//		Orders or=dao.getOrderByuser(users);
		System.out.println("Enter item id>>");
		int id=sc.nextInt();
		List<Orders> order=users.getOrder();
		for(Orders o:order) {
//			System.out.println(o);
			if(id==o.getOrderId()) {
				id=o.getOrderId();
				break;
			}
		}
		
		
//		Orders or=dao.getOrderById(int orderId);
		
		System.out.println("Enter item id>>");
		int itemId=sc.nextInt();
		System.out.println("Enter item name>>");
		String itemName=sc.next();
		System.out.println("Enter item cost>>");
		int itemCost=sc.nextInt();
		Items it=new Items();
		it.setItemCost(itemCost);
		it.setItemId(itemId);
		it.setItemName(itemName);
		dao.updateItems(it);
		items.add(it);
		
		Orders or=dao.getOrderById(id);
		int updatedCost=or.getTotalCost()-it.getItemCost()+itemCost;
		
		or.setTotalCost(updatedCost);
		dao.updateOrders(or);

	}

}
