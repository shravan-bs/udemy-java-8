package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	public MyDate orderDate;
	public double orderAmount = 0.00;
	public String customer;
	public String product;
	public int quantity;
	public static double taxRate;

	static {
		taxRate = 0.05;
	}

	public static void setTaxRate(double taxRateIn) {
		taxRate = taxRateIn;
	}

	public static double computeTaxOn(double parm) {
		return parm * taxRate;
	}

	public double computeTax() {
		return orderAmount * taxRate;
	}

	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}

	public Order(MyDate d, double amt, String c){
		this(d, amt, c, "Anvil", 1);
	}

	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
