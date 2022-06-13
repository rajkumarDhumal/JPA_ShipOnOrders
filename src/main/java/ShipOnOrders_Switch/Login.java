package ShipOnOrders_Switch;

import java.util.Scanner;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class Login {
	public Login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name>>");
		String userName=sc.next();
		System.out.println("Enter Password>>");
		String Password=sc.next();
		
		ShipOnOrders_Dao dao=new ShipOnOrders_Dao();
		Users users=dao.getUserByname(userName);
		while(true) {
			if (users != null) {
				if(users.getPassword().equals(Password) ) {
					
					System.out.println("1.Place Order \n"+"2.Show Order \n"+"3.update Item"+"4.Delete Item \n"+"5.Exit \n"+">>");
					int select=sc.nextInt();
					switch(select) {
					
					case 1:{
						new PlaceOrder(users);
					}break;

					case 2:{
//						Orders or=dao.getOrderByuser(users);

						new ShowOrder(users);

					}break;
					
					case 3:{
						new UpdateItem(users);
					}
					case 4:{
						
					}
					case 5:{
						
					}
				}
			}
				else {
					System.out.println("Enter correct password");
				}
		}
			else {
				System.out.println("Enter correct Username and password");
			}
		}
		

}
}
