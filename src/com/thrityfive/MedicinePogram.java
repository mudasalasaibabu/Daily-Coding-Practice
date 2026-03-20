package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator implements Comparator<Medicine>{

	@Override
	public int compare(Medicine o1, Medicine o2) {
		return o1.getPrice()-o2.getPrice();
	}
	
}
public class MedicinePogram {
	
	public static Medicine[] getPriceByDisease(Medicine m[],String disease) {
		Medicine m2[]=new Medicine[0];
		for(int i=0;i<m.length;i++) {
			if(m[i].getDisease().equalsIgnoreCase(disease)) {
				m2=Arrays.copyOf(m2,m2.length+1);
				m2[m2.length-1]=m[i];
			}
		}
		MyComparator myComparator = new MyComparator();
		Arrays.sort(m2,myComparator);
		return m2;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Medicine m[]=new Medicine[4];
		for(int i=0;i<m.length;i++) {
			String mName=scan.nextLine();
			String batch=scan.nextLine();
			String disease=scan.nextLine();
			int price=scan.nextInt();
			scan.nextLine();
			m[i]=new Medicine(mName,batch,disease,price);
		}
		Medicine[] priceByDisease = getPriceByDisease(m,scan.nextLine());
		for(Medicine price:priceByDisease) {
			System.out.println(price.getPrice());
		}
	}

}
