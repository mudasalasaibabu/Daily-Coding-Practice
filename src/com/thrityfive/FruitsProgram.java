package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator6 implements Comparator<Fruits>{

	@Override
	public int compare(Fruits o1, Fruits o2) {
		
		return o2.getPrice()-o1.getPrice();
	}
	
}
public class FruitsProgram {
	public static int findMaximumPriceByRating(Fruits f[],int rating) {
		Fruits f1[]=new Fruits[0];
		for(int i=0;i<f.length;i++) {
			if(f[i].getRating()>rating) {
				f1=Arrays.copyOf(f1,f1.length+1);
				f1[f1.length-1]=f[i];
			}
		}
		MyComparator6 myComparator6 = new MyComparator6();
		Arrays.sort(f1,myComparator6);
		if(f1.length>=1) {
			return f1[0].getFruitId();
		}else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Fruits f[]=new Fruits[4];
		for(int i=0;i<f.length;i++) {
			int fruitId = scan.nextInt();
			scan.nextLine();
			String fruitName=scan.nextLine();
			int price = scan.nextInt();
			int rating = scan.nextInt();
			f[i]=new Fruits(fruitId,fruitName,price,rating);
			}
		int rating = scan.nextInt();
		int maximumPriceByRating = findMaximumPriceByRating(f,rating);
		System.out.println(maximumPriceByRating);
	}

}
