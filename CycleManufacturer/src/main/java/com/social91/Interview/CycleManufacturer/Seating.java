package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;

public class Seating{
	
	private double cost;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double priceEvaluation() {
		Seating seat = new Seating();
		Scanner sc = new Scanner(System.in);
		System.out.println("Print seat cost:");
		double priceSeat = sc.nextDouble();
		seat.setCost(priceSeat);
		sc.close();
		return priceSeat;
		
	}


}
