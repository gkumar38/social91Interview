package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;

public class Wheels{
	
	private double wheelCost;
	
	
	
	public double getWheelCost() {
		return wheelCost;
	}
	public void setWheelCost(double wheelCost) {
		this.wheelCost = wheelCost;
	}
	public double priceEvaluation() {
		Wheels wheel = new Wheels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Print cost of tube");
		double tubeCost = sc.nextDouble();
		System.out.println("Print cost of gear");
		double gearCost =  sc.nextDouble();
		System.out.println("Print cost of frame");
		double frameCost = sc.nextDouble();
		wheel.setWheelCost(frameCost+gearCost+tubeCost);
		return getWheelCost();
	}
	
	
	 

}
