package worldpc.service;

import java.util.List;

import worldpc.model.Computer;

public class Order {

	private final int idOrder;
	
	private final List<Computer> computers;
	
	private static int orderCount;
	
	
	public Order() {
		computers = new java.util.ArrayList<>();
		idOrder = ++orderCount;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public void showOrder() {
		System.out.println("Order ID: " + idOrder);
		System.out.println("Total of Computers in this order:" + computers.size());
		System.out.println();
		
		computers.forEach(System.out::println);
		}
	}

