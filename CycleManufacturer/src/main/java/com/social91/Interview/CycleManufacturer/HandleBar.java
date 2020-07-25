package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;

public class HandleBar {
	
	private double designCost;
	
	public double getDesignCost() {
		return designCost;
	}
	public void setDesignCost(double designCost) {
		this.designCost = designCost;
	}
	
	public double priceEvaluation() {
		HandleBar chainAssembly = new HandleBar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Print handle cost");
		double handleCost = sc.nextDouble();
		chainAssembly.setDesignCost(handleCost);
		sc.close();
		return getDesignCost();
	}	
}
