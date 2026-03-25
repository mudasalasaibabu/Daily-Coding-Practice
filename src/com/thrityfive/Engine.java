package com.thrityfive;

public class Engine {
private int engineld;
private String engineName;
private String engineType;
private double enginePrice;
public Engine() {
	super();
	// TODO Auto-generated constructor stub
}
public Engine(int engineld, String engineName, String engineType, double enginePrice) {
	super();
	this.engineld = engineld;
	this.engineName = engineName;
	this.engineType = engineType;
	this.enginePrice = enginePrice;
}
public int getEngineld() {
	return engineld;
}
public void setEngineld(int engineld) {
	this.engineld = engineld;
}
public String getEngineName() {
	return engineName;
}
public void setEngineName(String engineName) {
	this.engineName = engineName;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}
public double getEnginePrice() {
	return enginePrice;
}
public void setEnginePrice(double enginePrice) {
	this.enginePrice = enginePrice;
}

}
