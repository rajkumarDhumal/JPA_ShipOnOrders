package ShipOnOrders_Switch;

import java.util.List;
import java.util.Scanner;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class ShowOrder {
	public ShowOrder(Users users) {
//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("Enter order ID>>");
		
		
//		ShipOnOrders_Dao dao2=new ShipOnOrders_Dao();
		List<Orders> order =users.getOrder();
		for(Orders o:order) {
			System.out.println("Order id >> "+o.getOrderId());
			System.out.println("order date >> "+o.getOrderDate());
			System.out.println("order total cost >> "+o.getTotalCost());
			
			List<Items>it=o.getItems();
			
			
			for(Items i1:it) {
				System.out.println("-------------------------------");
				System.out.println("Item ID >> "+i1.getItemId());
				System.out.println("Item name >> "+i1.getItemName());
				System.out.println("Item Cost >> "+i1.getItemCost());
			}
			System.out.println("********************************");
		};
		
	}

}
