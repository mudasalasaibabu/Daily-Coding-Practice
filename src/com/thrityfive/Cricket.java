package com.thrityfive;

public class Cricket {
private int id;
private String name;
private int iccRank;
private int matchesPlayed;
private int runsScored;
public Cricket() {
	super();
	// TODO Auto-generated constructor stub
}
public Cricket(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
	super();
	this.id = id;
	this.name = name;
	this.iccRank = iccRank;
	this.matchesPlayed = matchesPlayed;
	this.runsScored = runsScored;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getIccRank() {
	return iccRank;
}
public int getMatchesPlayed() {
	return matchesPlayed;
}
public int getRunsScored() {
	return runsScored;
}

}
