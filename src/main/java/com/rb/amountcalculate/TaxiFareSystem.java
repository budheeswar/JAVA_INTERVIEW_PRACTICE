package com.rb.amountcalculate;

import java.util.ArrayList;
import java.util.List;

public class TaxiFareSystem {
	/*
	 * Problem 1: Online Taxi Booking System Problem Statement: An online taxi
	 * booking platform has two types of rides: Standard and Premium.
	 * 
	 * Standard rides charge Rs. 10 per kilometer. If the ride distance is more than
	 * 15 km, a discount of 5% applies to the total fare. Premium rides charge Rs.
	 * 20 per kilometer. If the total fare exceeds Rs. 500, a flat discount of Rs.
	 * 50 is applied. A customer has booked the following rides:
	 * 
	 * Ride Type    Distance (in km) 
	 * Standard       10 
	 * Premium        30 
	 * Standard       20 
	 * 
	 * Tasks to Solve:	  
	 * Use OOP principles to represent the rides. Identify the ride with the highest
	 * fare after applying discounts. Calculate the total fare for all rides after
	 * applying applicable discounts.
	 */

	public static void main(String[] args) {

		
		List<TaxiRide> rides = new ArrayList<>();
		rides.add(new TaxiRide("Standard",10));
		rides.add(new TaxiRide("Premium",30));
		rides.add(new TaxiRide("Standard",20));
		
		double highestFare=0;
		TaxiRide highestRide=null;
		double totalFare=0;
		
		for(TaxiRide ride: rides) {
			double fare = ride.calculateTotalFare();
			totalFare=totalFare+fare;
			if(highestFare < fare) {
				highestFare=fare;
				highestRide =ride;
			}
		}
		System.out.println("HIGHEST FARE AFTER DISCOUNT IS :"+highestRide.getRideType()+" distance: "+highestRide.getDistanceInKm());
		System.out.println("TOTAL FARE IS "+totalFare);
		
		

	}

}
