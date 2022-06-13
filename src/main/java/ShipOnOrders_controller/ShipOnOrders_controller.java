package ShipOnOrders_controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ShipOnOrders_Dao.ShipOnOrders_Dao;
import ShipOnOrders_Switch.Login;
import ShipOnOrders_Switch.PlaceOrder;
import ShipOnOrders_Switch.ShowOrder;
import ShipOnOrders_Switch.Signup;
import ShipOnOrders_Switch.UpdateItem;
import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;

public class ShipOnOrders_controller {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ShipOnOrders_Dao dao=new ShipOnOrders_Dao();
		System.out.println("*************Ship on Orders*************");
		
//		EntityManagerFactory factory =Persistence.createEntityManagerFactory("raj");
//		EntityManager manager=factory.createEntityManager();
		
		while(true) {
			System.out.println("1.Signup \n"+"2.Login \n"+"3.exit");
			System.out.println(">>");
			int command=sc.nextInt();
			
			switch(command) {
			case 1:{
				List<Items>item=new ArrayList<Items>();
				List<Orders>order=new ArrayList<Orders>();
				
				new Signup();
				
			}break;
			case 2:{
				new Login();
				}break;
			case 3:{
				//exit**********
			}break;
			}
		}
		
	}
}


