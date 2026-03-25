package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyCompartor3 implements Comparator<Flower>{

	@Override
	public int compare(Flower o1, Flower o2) {
		
		return o1.getPrice()-o2.getPrice();
	}
	
}
public class FlowerProgram {
	public static int findMinPriceByType(Flower f[],String type) {
		Flower f1[]=new Flower[0];
		for(int i=0;i<f.length;i++) {
			if(f[i].getType().equalsIgnoreCase(type) && f[i].getRating()>3) {
				f1=Arrays.copyOf(f1,f1.length+1);
				f1[f1.length-1]=f[i];
			}
		}
		MyCompartor3 myCompartor3 = new MyCompartor3();
		Arrays.sort(f1,myCompartor3);
		if(f1.length>0) {
		return f1[0].getFlowerId();
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Flower f[]=new Flower[4];
		for(int i=0;i<f.length;i++) {
			int flowerId=scan.nextInt();
			scan.nextLine();
			String flowerName=scan.nextLine();
			int price=scan.nextInt();
			int rating=scan.nextInt();
			scan.nextLine();
			String type=scan.nextLine();
			f[i]=new Flower(flowerId,flowerName,price,rating,type);
		}
		String type=scan.nextLine();
		int minPriceByType = findMinPriceByType(f,type);
		if(minPriceByType!=0) {
			System.out.println(minPriceByType);
		}else {
			System.out.println("There is no flower with given type.");
		}
	}

}
/*
123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
Biennial
*/
