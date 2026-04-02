package com.thrityfive;

public class Student {
private int rollNo;
private String name;
private String branch;
private double score;
private boolean dayScholar;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.branch = branch;
	this.score = score;
	this.dayScholar = dayScholar;
}
public int getRollNo() {
	return rollNo;
}
public String getName() {
	return name;
}
public String getBranch() {
	return branch;
}
public double getScore() {
	return score;
}
public boolean isDayScholar() {
	return dayScholar;
}

}
