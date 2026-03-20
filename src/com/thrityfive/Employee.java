package com.thrityfive;

public class Employee {
private int empoyeeId;
private String name;
private String branch;
private double rating;
private boolean companyTransport;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empoyeeId, String name, String branch, double rating, boolean companyTransport) {
	super();
	this.empoyeeId = empoyeeId;
	this.name = name;
	this.branch = branch;
	this.rating = rating;
	this.companyTransport = companyTransport;
}
public int getEmpoyeeId() {
	return empoyeeId;
}
public void setEmpoyeeId(int empoyeeId) {
	this.empoyeeId = empoyeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public boolean isCompanyTransport() {
	return companyTransport;
}
public void setCompanyTransport(boolean companyTransport) {
	this.companyTransport = companyTransport;
}
@Override
public String toString() {
	return "Employee [empoyeeId=" + empoyeeId + ", name=" + name + ", branch=" + branch + ", rating=" + rating
			+ ", companyTransport=" + companyTransport + "]";
}

}
