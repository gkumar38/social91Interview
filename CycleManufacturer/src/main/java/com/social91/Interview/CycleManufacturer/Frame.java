package com.social91.Interview.CycleManufacturer;

import java.util.Scanner;

public class Frame {
	
	private CycleCommonAttribute cycleCommon;
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
	public CycleCommonAttribute getCycleCommon() {
		return cycleCommon;
	}
	public void setCycleCommon(CycleCommonAttribute cycleCommon) {
		this.cycleCommon = cycleCommon;
	}
	public double priceEvaluation() {
		Frame frame = new Frame();
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rods:");
		int no_rods = sc.nextInt();
		System.out.println("Print rod cost:");
		double priceRod = sc.nextDouble();
		double price = no_rods*priceRod;
		frame.setDesigncost(price);
		sc.close();
		return frame.getDesigncost();
		
	}

}
