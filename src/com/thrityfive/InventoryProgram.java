package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class InventoryProgram {
	public static Inventory[]Replenish(Inventory in[], int limit){
		Inventory in1[]=new Inventory[0];
		for(int i=0;i<in.length;i++) {
			if(limit>=in[i].getThreshold()) {
				in1=Arrays.copyOf(in1,in1.length+1);
				in1[in1.length-1]=in[i];
			}
		}
		return in1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Inventory in[]=new Inventory[4];
		for(int i=0;i<in.length;i++) {
			String inventoryId=scan.nextLine();
			int maximumQuantity=scan.nextInt();
			int currentQuantity=scan.nextInt();
			int threshold=scan.nextInt();
			scan.nextLine();
			in[i]=new Inventory(inventoryId, maximumQuantity,currentQuantity,threshold);	
		}
		int limit=scan.nextInt();
		Inventory[] replenish = Replenish(in,limit);
		for(Inventory i:replenish) {
			if(i.getThreshold()>75) {
				System.out.println(i.getInventoryId()+" "+"Critical Filling");
			}else if(i.getThreshold()>50 && i.getThreshold()<=75) {
				System.out.println(i.getInventoryId()+" "+"Moderate Filling");
			}else {
				System.out.println(i.getInventoryId()+" "+"Non-Critical Filling");
			}
		}
	}

}
