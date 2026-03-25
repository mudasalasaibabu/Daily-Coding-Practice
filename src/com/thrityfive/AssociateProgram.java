package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class AssociateProgram {
	
	public static Associate[] associatesForGivenTechnology(Associate a[], String technology) {
		Associate a1[]=new Associate[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].getTechnology().equalsIgnoreCase(technology) && a[i].getExperienceInYears()%5==0) {
				a1=Arrays.copyOf(a1,a1.length+1);
				a1[a1.length-1]=a[i];
			}
		}
		return a1;
	}
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Associate a[]=new Associate[5];
	for(int i=0;i<a.length;i++) {
		int id = scan.nextInt();
		scan.nextLine();
		String name=scan.nextLine();
		String technology=scan.nextLine();
		int experienceInYears =scan.nextInt();
		a[i]=new Associate(id,name,technology,experienceInYears);
	}
	scan.nextLine();
	String technology=scan.nextLine();
	Associate[] associatesForGivenTechnology = associatesForGivenTechnology(a,technology);
	for(Associate a1:associatesForGivenTechnology) {
		System.out.println(a1.getId());
	}
	}

}
