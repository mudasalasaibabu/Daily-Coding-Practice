package com.thrityfive;

import java.util.Scanner;

public class PlayerProgram {
	public static int findPointsForGivenSkill(Player p[],String skill) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			if(p[i].getSkill().equalsIgnoreCase(skill)) {
				sum+=p[i].getPoints();
			}
		}
		return sum;
	}
	public static int getPlayerBasedOnLevel(Player p[],String skill,String level) {
		int id=0;
		for(int i=0;i<p.length;i++) {
			if(p[i].getSkill().equalsIgnoreCase(skill) &&p[i].getLevel().equalsIgnoreCase(level)&&p[i].getPoints()>=20) {
				id=p[i].getPlayerId();
			}
		}
		return id;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Player p[]=new Player[4];
		for(int i=0;i<4;i++) {
			int id=scan.nextInt();
			scan.nextLine();
			String skill=scan.nextLine();
			String level=scan.nextLine();
			int points=scan.nextInt();
			p[i]=new Player(id,skill,level,points);
		}
		scan.nextLine();
		String s=scan.nextLine();
		String l=scan.nextLine();
		int pointsForGivenSkill = findPointsForGivenSkill(p,s);
		int playerBasedOnLevel = getPlayerBasedOnLevel(p,s,l);
		System.out.println(pointsForGivenSkill);
		System.out.println(playerBasedOnLevel);
	}

}
