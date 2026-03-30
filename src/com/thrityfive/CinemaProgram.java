package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaProgram {
	public static int findAvgBudgetByDirector(Cinema c[],String director) {
		int sum=0,count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i].getDirector().equalsIgnoreCase(director)) {
				count++;
				sum+=c[i].getBudget();
			}
		}
		return sum/count;
	}
	
	public static Cinema[] getMovieByRatingBudget(Cinema c[],int rating, int budget) {
		Cinema c1[]=new Cinema[0];
		for(int i=0;i<c.length;i++) {
			if(c[i].getBudget()==budget && c[i].getRating()==rating && c[i].getBudget()%c[i].getRating()==0) {
				c1=Arrays.copyOf(c1,c1.length+1);
				c1[c1.length-1]=c[i];
			}
		}
		return c1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Cinema c[]=new Cinema[4];
		for(int i=0;i<c.length;i++) {
			int mId=scan.nextInt();
			scan.nextLine();
			String dire=scan.nextLine();
			int rating=scan.nextInt();
			int budget=scan.nextInt();
			c[i]=new Cinema(mId,dire,rating,budget);
			
		}
		scan.nextLine();
		String dire=scan.nextLine();
		int rating=scan.nextInt();
		int budget=scan.nextInt();
		
		int avgBudgetByDirector = findAvgBudgetByDirector(c,dire);
		System.out.println(avgBudgetByDirector);
		Cinema[] movieByRatingBudget = getMovieByRatingBudget(c,rating,budget);
		for(Cinema c1:movieByRatingBudget) {
			System.out.println(c1.getMovieId());
		}
	}

}
