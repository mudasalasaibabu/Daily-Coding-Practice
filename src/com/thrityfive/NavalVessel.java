package com.thrityfive;

public class NavalVessel {
private int vesselId;
private String vesselName;
private int noOfVoyagesPlanned;
private int noOfVoyagesCompleted;
private String purpose;
public NavalVessel() {
	super();
	// TODO Auto-generated constructor stub
}
public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
	super();
	this.vesselId = vesselId;
	this.vesselName = vesselName;
	this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	this.noOfVoyagesCompleted = noOfVoyagesCompleted;
	this.purpose = purpose;
}
public int getVesselId() {
	return vesselId;
}
public void setVesselId(int vesselId) {
	this.vesselId = vesselId;
}
public String getVesselName() {
	return vesselName;
}
public void setVesselName(String vesselName) {
	this.vesselName = vesselName;
}
public int getNoOfVoyagesPlanned() {
	return noOfVoyagesPlanned;
}
public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
	this.noOfVoyagesPlanned = noOfVoyagesPlanned;
}
public int getNoOfVoyagesCompleted() {
	return noOfVoyagesCompleted;
}
public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
	this.noOfVoyagesCompleted = noOfVoyagesCompleted;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}

}
