package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private  Date moment ;
	private OrderStatus status;

	private Client clients;
	
	List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
		
	}
	
	
	public Order(Date moment, OrderStatus status, Client clients) {
		
		this.moment = moment;
		this.status = status;
		this.clients = clients;
	}
	
	

	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getClients() {
		return clients;
	}


	public void setClients(Client clients) {
		this.clients = clients;
	}

	public void addItem(OrderItem item) {
		
		items.add(item);
	
	}
	public  void removeItem(Order item) {
		
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		
		for(OrderItem it : items) {
			 sum += it.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(clients + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
	
	}
