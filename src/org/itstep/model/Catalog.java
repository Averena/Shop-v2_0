package org.itstep.model;

public class Catalog {

	private int quantity,price;

	
	public Catalog(int quantity, int price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	

}
