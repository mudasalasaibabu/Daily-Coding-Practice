package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class MovieProgram {
	public static Movie[] getMovieByGenre(Movie m[],String genre) {
		Movie m1[]=new Movie[0];
		for(int i=0;i<m.length;i++) {
			if(m[i].getGenre().equalsIgnoreCase(genre)) {
			m1=Arrays.copyOf(m1,m1.length+1);
			m1[m1.length-1]=m[i];
			}
		}
		return m1;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Movie m[]=new Movie[4];
		for(int i=0;i<m.length;i++) {
			String movieName = scan.nextLine();
			String company = scan.nextLine();
			String genre = scan.nextLine();
			int budget=scan.nextInt();
			scan.nextLine();
			m[i]=new Movie(movieName,company,genre,budget);
		}
		String genre = scan.nextLine();
		Movie[] movieByGenre = getMovieByGenre(m,genre);
		for(Movie m1:movieByGenre) {
			if(m1.getBudget()>=80000000) {
				System.out.println("High Budget Movie");
			}else {
				System.out.println("Low Budget Movie");
			}
		}
	}

}
