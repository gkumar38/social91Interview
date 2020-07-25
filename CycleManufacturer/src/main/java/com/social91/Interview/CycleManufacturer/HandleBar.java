package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class HandleBar implements EvaluateCost{
private BlockingQueue<EvaluateCost> queue;
	
	public HandleBar(BlockingQueue<EvaluateCost> queue2) {
		 this.queue=queue2;
		// TODO Auto-generated constructor stub
	}
	
	private double designCost;
	
	public double getDesignCost() {
		return designCost;
	}
	public void setDesignCost(double designCost) {
		this.designCost = designCost;
	}
	
	public double priceEvaluation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print handle cost");
		double handleCost = sc.nextDouble();
		setDesignCost(handleCost);
		sc.close();
		return getDesignCost();
	}	
}
