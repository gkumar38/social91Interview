package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class ChainAssembly implements EvaluateCost{
	private BlockingQueue<EvaluateCost> queue;
	
	public ChainAssembly(BlockingQueue<EvaluateCost> queue2) {
		 this.queue=queue2;
		// TODO Auto-generated constructor stub
	}
	private double chainCost;
	
	public double getChainCost() {
		return chainCost;
	}
	public void setChainCost(double chainCost) {
		this.chainCost = chainCost;
	}
	public double priceEvaluation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print chain cost");
		double chainCost = sc.nextDouble();
		setChainCost(chainCost);
		sc.close();
		return chainCost;
	}
	
	
	
	

}
