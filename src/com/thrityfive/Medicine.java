package com.thrityfive;

public class Medicine {
	private String MedicineName;
	private String batch;
	private String disease;
	private int price;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(String medicineName, String batch, String disease, int price) {
		super();
		MedicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
