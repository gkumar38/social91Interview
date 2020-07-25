package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Frame implements EvaluateCost{
	
	private BlockingQueue<EvaluateCost> queue;
	
	public Frame(BlockingQueue<EvaluateCost> queue2) {
		 this.queue=queue2;
		// TODO Auto-generated constructor stub
	}
	private double rodcost;
	private double designcost;
	private int rodnumber;
	public double getRodcost() {
		return rodcost;
	}
	public void setRodcost(double rodcost) {
		this.rodcost = rodcost;
	}
	public double getDesigncost() {
		return designcost;
	}
	public void setDesigncost(double designcost) {
		this.designcost = designcost;
	}
	public int getRodnumber() {
		return rodnumber;
	}
	public void setRodnumber(int rodnumber) {
		this.rodnumber = rodnumber;
	}
	public double priceEvaluation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rods:");
		int no_rods = sc.nextInt();
		System.out.println("Print rod cost:");
		double priceRod = sc.nextDouble();
		double price = no_rods*priceRod;
		setDesigncost(price);
		sc.close();
		return price;
		
	}

}
