package com.rb.amountcalculate;

public class Product {
	
	private String name;
	private String category;
	private double pricePerUnit;
	private int quantity;
	private double bulkDiscount;
	private double nonPerishableDiscount;
	
	public Product(String name, String category, double pricePerUnit, int quantity, double bulkDiscount,
			double nonPerishableDiscount) {
		super();
		this.name = name;
		this.category = category;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.bulkDiscount = bulkDiscount;
		this.nonPerishableDiscount = nonPerishableDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double calculateDiscountedTotal() {
		double total=quantity * pricePerUnit;
		
		if(category == "Perishable" && quantity >5) {
			total = total-total*(bulkDiscount/100);
		}
		if(category =="Non-Perishable" && total >2000) {
			total=total-total*(nonPerishableDiscount/100);
		}
		return total;
	}
	
	
	
	

}
