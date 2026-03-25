package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator4 implements Comparator<Footwear>{

	@Override
	public int compare(Footwear o1, Footwear o2) {
		return o2.getPrice()-o1.getPrice();
	}
	
}
public class FootwearProgram {
	public static int getCountByType(Footwear fw[],String type) {
		int count=0;
		for(int i=0;i<fw.length;i++) {
			if(fw[i].getFootwearType().equalsIgnoreCase(type)) {
				count++;
			}
		}
		return count;
	}
	
	public static Footwear getSecondHighestPriceByBrand(Footwear fw[],String brand) {
		Footwear fw1[]=new Footwear[0];
		for(int i=0;i<fw.length;i++) {
		if(fw[i].getFootwearName().equalsIgnoreCase(brand)) {
			fw1=Arrays.copyOf(fw1,fw1.length+1);
			fw1[fw1.length-1]=fw[i];
		}
		}
		MyComparator4 myComparator4 = new MyComparator4();
		Arrays.sort(fw1, myComparator4);
		if(fw1.length>=2) {
		return fw1[1];
		}else if(fw1.length==1){
			return fw1[0];
		}	
			else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Footwear fw[]=new Footwear[5];
		for(int i=0;i<fw.length;i++) {
			int footwearId = scan.nextInt();
			scan.nextLine();
			String footwearName= scan.nextLine();
			String footwearType= scan.nextLine();
			int price = scan.nextInt();
			fw[i]=new Footwear(footwearId,footwearName,footwearType,price);
		}
		scan.nextLine();
		String footwearType= scan.nextLine();
		String footwearName= scan.nextLine();
		int countByType = getCountByType(fw,footwearType);
		if(countByType!=0) {
		System.out.println(countByType);
		}else {
			System.out.println("Footwear not available");
		}
		 Footwear secondHighestPriceByBrand = getSecondHighestPriceByBrand(fw,footwearName);
		 if(secondHighestPriceByBrand!=null) {
		System.out.println(secondHighestPriceByBrand.getFootwearId());
		System.out.println(secondHighestPriceByBrand.getFootwearName());
		System.out.println(secondHighestPriceByBrand.getPrice());
		 }else {
			 System.out.println("Brand not available");
		 }

	}

}
