package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;

public class ChainAssembly {
	
	
	private double chainCost;
	
	public double getChainCost() {
		return chainCost;
	}
	public void setChainCost(double chainCost) {
		this.chainCost = chainCost;
	}
	public double priceEvaluation() {
		ChainAssembly chainAssembly = new ChainAssembly();
		Scanner sc = new Scanner(System.in);
		System.out.println("Print chain cost");
		double chainCost = sc.nextDouble();
		chainAssembly.setChainCost(chainCost);
		sc.close();
		return chainCost;
	}
	
	
	
	

}
