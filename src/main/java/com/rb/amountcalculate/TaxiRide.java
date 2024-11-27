package com.rb.amountcalculate;

public class TaxiRide {
	private String rideType;
	private int distanceInKm;
	public TaxiRide(String rideType, int distanceInKm) {
		super();
		this.rideType = rideType;
		this.distanceInKm = distanceInKm;
	}
	public String getRideType() {
		return rideType;
	}
	public void setRideType(String rideType) {
		this.rideType = rideType;
	}
	public int getDistanceInKm() {
		return distanceInKm;
	}
	public void setDistanceInKm(int distanceInKm) {
		this.distanceInKm = distanceInKm;
	}
	
	public double calculateTotalFare() {
		double totalFare=0;
		if(rideType.equalsIgnoreCase("standard")) {
			totalFare=distanceInKm*10;
			if(distanceInKm >15) {
				totalFare = totalFare-totalFare*(5/100);
			}
		}
		if(rideType.equalsIgnoreCase("Premium")) {
			totalFare=distanceInKm*20;
			if(totalFare >500) {
				totalFare= totalFare-50;
			}
		}
		return totalFare;
	}
	
	

}
