package com.thrityfive;

public class Fruits {
private int fruitId;
private String fruitName;
private int price;
private int rating;
public Fruits() {
	super();
	// TODO Auto-generated constructor stub
}
public Fruits(int fruitId, String fruitName, int price, int rating) {
	super();
	this.fruitId = fruitId;
	this.fruitName = fruitName;
	this.price = price;
	this.rating = rating;
}
public int getFruitId() {
	return fruitId;
}
public void setFruitId(int fruitId) {
	this.fruitId = fruitId;
}
public String getFruitName() {
	return fruitName;
}
public void setFruitName(String fruitName) {
	this.fruitName = fruitName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
