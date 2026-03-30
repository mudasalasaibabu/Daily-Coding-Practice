package com.thrityfive;

public class Sim {
private int id;
private String company;
private int balance;
private double ratePerSecond;
private String circle;
public Sim() {
	super();
	// TODO Auto-generated constructor stub
}
public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
	super();
	this.id = id;
	this.company = company;
	this.balance = balance;
	this.ratePerSecond = ratePerSecond;
	this.circle = circle;
}
public int getId() {
	return id;
}
public String getCompany() {
	return company;
}
public int getBalance() {
	return balance;
}
public double getRatePerSecond() {
	return ratePerSecond;
}
public String getCircle() {
	return circle;
}

}
