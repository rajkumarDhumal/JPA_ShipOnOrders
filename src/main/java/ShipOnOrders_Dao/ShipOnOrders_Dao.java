package ShipOnOrders_Dao;

import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ShipOnOrders_dto.Items;
import ShipOnOrders_dto.Orders;
import ShipOnOrders_dto.Users;

public class ShipOnOrders_Dao {
	public EntityManager getEntityManager() {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("raj");
		EntityManager manager=factory.createEntityManager();
		return manager; 
	}
	public void insertUser(Users u) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.persist(u);
		transcation.commit();
		System.out.println("signup is completed......");
	}
	public void insertOrder(Orders o) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.persist(o);
		transcation.commit();
		System.out.println("Order is placed......");
		
	}
	public void insertItems(Items i) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.persist(i);
		transcation.commit();
		System.out.println("......");
		
	}
	public Orders getOrderById(int orderId) {
		EntityManager manager=getEntityManager();
		Orders order=manager.find(Orders.class, orderId);
		return order;
	}
	public Orders getOrderByuser(Users users) {
		EntityManager manager=getEntityManager();
		Orders orders=manager.find(Orders.class, users);
		return orders;
	}
	public Users getUserByname(String userName) {
		EntityManager manager=getEntityManager();
		Users user=manager.find(Users.class, userName);
		return user;
	}
	
	public Items getItemById(int itemId) {
		EntityManager manager=getEntityManager();
		Items items=manager.find(Items.class, itemId);
		return items;
	}
	public void updateItems(Items i) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.merge(i);
		transcation.commit();
		System.out.println("Item is updated......");
		
	}
	public void updateOrders(Orders o) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.merge(o);
		transcation.commit();
		System.out.println("Item is updated......");
		
	}
	public void updateUsers(Users u) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.merge(u);
		transcation.commit();
		System.out.println("Item is updated......");
		
	}
	public void deleteItems(Items i) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.remove(i);
		transcation.commit();
		System.out.println("item is deleted......");
		
	}
	public void deleteOrder(Orders o) {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.remove(o);
		transcation.commit();
		System.out.println("order is deleted......");
		
	}
	
	
	
	
	
	
	

}
