package com.rb.amountcalculate;

import java.util.ArrayList;
import java.util.List;

public class AmountCalculate_GroceryOrder {

	public static void main(String[] args) {
		/*
		 * Coding Problem: Online Grocery Order System Problem Statement An online
		 * grocery store sells perishable and non-perishable products. Perishable
		 * products have a discount if ordered in bulk (more than 5 units), while
		 * non-perishable products have a flat discount of 5% if the total order value
		 * exceeds Rs. 2000. A customer has placed the following order:
		 *
		 * Product Category Price per Unit (in Rs.) Quantity Bulk Discount (%)
		 * Non-Perishable Discount (%) Apples Perishable 100 6 10 0 Rice (5kg bag)
		 * Non-Perishable 500 4 0 5 Milk (1 liter) Perishable 50 10 5 0
		 * 
		 * 
		 * Problem to Solve 1. Follow object-oriented programming practices. 
		 * 2. Identify the product with the highest total cost after applying applicable discounts.
		 * 3. Calculate the total amount payable by the customer after applying bulk and
		 * non-perishable discounts.
		 */
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apples","Perishable",100,6,10,0));
		products.add(new Product("Rice (5kg bag)","Non-Perishable",500,4,0,5));
		products.add(new Product("Milk (1 liter)","Perishable",50,10,5,0));
		
		double highestCost=0;
		Product highestProduct=null;
		double totalPayableCost=0;
		
		for(Product product: products) {
			double totalCost = product.calculateDiscountedTotal();
			totalPayableCost = totalPayableCost+totalCost;
			if(totalCost >= highestCost) {
				highestCost = totalCost;
				highestProduct = product;
			}
		}
		System.out.println("Total payable amount after discount is :"+totalPayableCost);
		System.out.println("Highest Cost after discount in Product is :"+highestProduct.getName());

	}

}
