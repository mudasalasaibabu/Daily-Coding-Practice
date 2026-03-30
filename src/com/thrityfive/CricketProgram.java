package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class CricketProgram {
	public static double[] findAverageOfRuns(Cricket c[],int target) {
		double d[]=new double[0];
		for(int i=0;i<c.length;i++) {
			if(c[i].getMatchesPlayed()>=target) {
				double avg=c[i].getRunsScored()/c[i].getMatchesPlayed();
				d=Arrays.copyOf(d,d.length+1);
				d[d.length-1]=avg;
			}
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Cricket c[]=new Cricket[4];
		for(int i=0;i<c.length;i++) {
			int id=scan.nextInt();
			scan.nextLine();
			String name=scan.nextLine();
			int iccRank=scan.nextInt();
			int matchesPlayed=scan.nextInt();
			int runsScored=scan.nextInt();
			c[i]=new Cricket(id,name,iccRank,matchesPlayed,runsScored);
			
		}
		int target=scan.nextInt();
		double[] averageOfRuns = findAverageOfRuns(c,target);
		for(double d:averageOfRuns) {
			if(d>80 && d<100) {
				System.out.println("Grade A");
			}else if(d>50 && d<79) {
				System.out.println("Grade B");
			}else {
				System.out.println("Grade C");
			}
			
		}

	}

}
