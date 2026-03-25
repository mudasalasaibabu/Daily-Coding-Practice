package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class InstitutionProgram {
	public static int FindNumClearancedByLoc(Institution in[],String loc) {
		int sum=0;
		for(int i=0;i<in.length;i++) {
			if(in[i].getLocation().equalsIgnoreCase(loc)) {
				sum+=in[i].getNoOfStudentsCleared();
			}
		}
		return sum;
	}
	
	public static Institution[] UpdateInstitutionGrade(Institution in[],String institutionName){
		Institution in1[]=new Institution[0];
		for(int i=0;i<in.length;i++) {
			if(in[i].getInstitutionName().equalsIgnoreCase(institutionName)) {
				in1=Arrays.copyOf(in1, in1.length+1);
				in1[in1.length-1]=in[i];
				int rating=in[i].getNoOfStudentsPlaced()*100/in[i].getNoOfStudentsCleared();
				if(rating >=80) {
					in[i].setGrade("A");
				}else {
					in[i].setGrade("B");
				}
			}
		}
		return in1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Institution in[]=new Institution[4];
		for(int i=0;i<in.length;i++) {
			int institutionId = scan.nextInt();
			scan.nextLine();
			String institutionName=scan.nextLine();
			int noOfStudentsPlaced = scan.nextInt();
			int noOfStudentsCleared = scan.nextInt();
			scan.nextLine();
			String location=scan.nextLine();
			in[i]=new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
		}
		String location=scan.nextLine();
		String institutionName=scan.nextLine();
		int findNumClearancedByLoc = FindNumClearancedByLoc(in,location);
		System.out.println(findNumClearancedByLoc);
		Institution[] updateInstitutionGrade = UpdateInstitutionGrade(in,institutionName);
		for(Institution i:updateInstitutionGrade) {
		System.out.println(i.getInstitutionName()+"::"+i.getGrade());
		}
	}

}
