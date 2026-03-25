package com.thrityfive;

public class Antenna {
private int antennaId ;
private String antennaName;
private String projectLead;
private double antennaVSWR;
public Antenna() {
	super();
	// TODO Auto-generated constructor stub
}
public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
	super();
	this.antennaId = antennaId;
	this.antennaName = antennaName;
	this.projectLead = projectLead;
	this.antennaVSWR = antennaVSWR;
}
public int getAntennaId() {
	return antennaId;
}
public void setAntennaId(int antennaId) {
	this.antennaId = antennaId;
}
public String getAntennaName() {
	return antennaName;
}
public void setAntennaName(String antennaName) {
	this.antennaName = antennaName;
}
public String getProjectLead() {
	return projectLead;
}
public void setProjectLead(String projectLead) {
	this.projectLead = projectLead;
}
public double getAntennaVSWR() {
	return antennaVSWR;
}
public void setAntennaVSWR(double antennaVSWR) {
	this.antennaVSWR = antennaVSWR;
}

}
