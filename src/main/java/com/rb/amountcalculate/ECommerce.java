package com.rb.amountcalculate;

public class ECommerce {
	/*
	 * Electronics: A flat 10% discount on orders above Rs. 3000. Clothing: Buy 2,
	 * get 1 free (on the least expensive item). Groceries: A bulk discount of 5%
	 * applies if more than 10 units of the same product are ordered. A customer has
	 * placed the following order:
	 */
	
	private String product;
	private String category;
	private double price;
	private int quantity;
	
	public ECommerce(String product, String category, double price, int quanity) {
		super();
		this.product = product;
		this.category = category;
		this.price = price;
		this.quantity = quanity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateTotalAmount() {
		double totalAmount=price * quantity;
		
		if(category.equalsIgnoreCase("Electronics") && totalAmount > 3000) {
			totalAmount = totalAmount-totalAmount *0.1;
		}else if(category.equalsIgnoreCase("Clothing")) {
			int discountedQuantities = quantity /3 ;
			totalAmount = totalAmount-(price * discountedQuantities);
		}else if (category.equalsIgnoreCase("Groceries") && quantity > 10) {
             totalAmount = totalAmount-totalAmount*(5/100);			
		}
		
		return totalAmount;
		
	}
	
	

}
