package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneProgram {
	public static int findPriceForGivenBrand(Phone p[],String brand) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			if(p[i].getBrand().equals(brand)) {
				sum+=p[i].getPrice();
			}
		}
		return sum;
	}
	
	public static Phone[] getPhoneIdBasedOnOs(Phone p[],String os) {
		Phone p1[]=new Phone[0];
		
		for(int i=0;i<p.length;i++) {
			if(p[i].getOs().equalsIgnoreCase(os)&& p[i].getPrice()>=50000) {
				p1=Arrays.copyOf(p1, p1.length+1);
				p1[p1.length-1]=p[i];
			}
		}
		return p1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Phone p[]=new Phone[4];
		for(int i=0;i<p.length;i++) {
			int phoneId=scan.nextInt();
			scan.nextLine();
			String os=scan.nextLine();
			String brand=scan.nextLine();
			int price=scan.nextInt();
			scan.nextLine();
			p[i]=new Phone(phoneId,os,brand,price);
		}
		String brand=scan.nextLine();
		String os=scan.nextLine();
		int priceForGivenBrand = findPriceForGivenBrand(p,brand);
		Phone[] phoneIdBasedOnOs = getPhoneIdBasedOnOs(p,os);
		System.out.println((priceForGivenBrand<=0)?"The given Brand is not available":priceForGivenBrand);
		for(Phone p1:phoneIdBasedOnOs) {
			System.out.println(p1.getPhoneId());
		}
	}

}
