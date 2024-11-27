package com.rb.amountcalculate;

import java.util.ArrayList;
import java.util.List;

public class ECommerceOrderDiscountCalculate {
	/*
	 * Problem Statement: An e-commerce platform offers discounts based on the
	 * product category:
	 * 
	 * Electronics: A flat 10% discount on orders above Rs. 3000. Clothing: Buy 2,
	 * get 1 free (on the least expensive item). Groceries: A bulk discount of 5%
	 * applies if more than 10 units of the same product are ordered. A customer has
	 * placed the following order:
	 * 
	 * Product          Category       Price (in Rs.)   Quantity 
	 * Smartphone       Electronics    15000             1
	 * T-shirt          Clothing       500               3 
	 * Rice (5kg bag)   Groceries      1000              12 
	 * 
	 * 
	 * Tasks to Solve:	  
	 * Represent the order using appropriate OOP classes. Calculate the total amount
	 * payable by the customer. Identify which product contributed the most to the
	 * total bill.
	 */

	public static void main(String[] args) {
		
		List<ECommerce> list= new ArrayList<>();
		list.add(new ECommerce("Smartphone","Electronics",15000,1));
		list.add(new ECommerce("T-shirt","Clothing",500,3));
		list.add(new ECommerce("Rice (5kg bag)","Groceries",1000,12));
		
		double totalPayableAmount=0;
		double highestBill = 0;
		ECommerce highestProduct = null;
		
		for(ECommerce p: list) {
			double bill = p.calculateTotalAmount();
			totalPayableAmount = totalPayableAmount+bill;
			if(bill > highestBill) {
				highestBill =bill;
				highestProduct = p;
			}
		}
		System.out.println("Total Amount "+totalPayableAmount);
		System.out.println("Highest Contributed Product "+highestProduct.getProduct()+" price "+highestProduct.getPrice());
		
		

	}

}
