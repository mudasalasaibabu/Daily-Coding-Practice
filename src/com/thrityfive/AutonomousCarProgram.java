package com.thrityfive;

import java.util.Scanner;

public class AutonomousCarProgram {
	
	public static int findTestPassedByEnv(AutonomousCar c[],String env) {
		int sum=0;
		for(int i=0;i<c.length;i++) {
			if(c[i].getEnvironment().equalsIgnoreCase(env)) {
				sum+=c[i].getNoOfTestsPassed();
			}
		}
		return sum;
	}
	public static String updateCarGrade(AutonomousCar c[],String brand) {
		int grade=0;
		for(int i=0;i<c.length;i++) {
			if(c[i].getBrand().equalsIgnoreCase(brand)) {
				 grade=c[i].getNoOfTestsPassed()*100/c[i].getNoOfTestsConducted();
			}
		}
		return (grade >=80)?brand+"::"+"A1":brand+"::"+"B2";
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		AutonomousCar c[]=new AutonomousCar[4];
		for(int i=0;i<c.length;i++) {
			int id=scan.nextInt();
			scan.nextLine();
			String brand=scan.nextLine();
			int noOfTestsConducted=scan.nextInt();
			int noOfTestsPassed=scan.nextInt();
			scan.nextLine();
			String environment=scan.nextLine();
			c[i]=new AutonomousCar(id,brand,noOfTestsConducted,noOfTestsPassed,environment);
			
		}
		
		String environment=scan.nextLine();
		String brand=scan.nextLine();
		int testPassedByEnv = findTestPassedByEnv(c,environment);
		System.out.println(testPassedByEnv);
		String updateCarGrade = updateCarGrade(c,brand);
		System.out.println(updateCarGrade);
	}

}
