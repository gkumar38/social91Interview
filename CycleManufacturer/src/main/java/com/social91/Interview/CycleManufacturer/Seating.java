package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Seating implements EvaluateCost{
	
private BlockingQueue<EvaluateCost> queue;
	
	public Seating(BlockingQueue<EvaluateCost> queue2) {
		 this.queue=queue2;
		
	}
	
	private double cost;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double priceEvaluation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print seat cost:");
		double priceSeat = sc.nextDouble();
		setCost(priceSeat);
		sc.close();
		return priceSeat;
		
	}


}
