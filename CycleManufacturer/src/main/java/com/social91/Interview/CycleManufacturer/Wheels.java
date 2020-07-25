package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Wheels implements EvaluateCost{
	
	private double wheelCost;
private BlockingQueue<EvaluateCost> queue;
	
	public Wheels(BlockingQueue<EvaluateCost> queue2) {
		 this.queue=queue2;
		
	}
	
	
	public double getWheelCost() {
		return wheelCost;
	}
	public void setWheelCost(double wheelCost) {
		this.wheelCost = wheelCost;
	}
	public double priceEvaluation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print cost of tube");
		double tubeCost = sc.nextDouble();
		System.out.println("Print cost of gear");
		double gearCost =  sc.nextDouble();
		System.out.println("Print cost of frame");
		double frameCost = sc.nextDouble();
		setWheelCost(frameCost+gearCost+tubeCost);
		return getWheelCost();
	}
	
	
	 

}
