package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator8 implements Comparator<Sim>{

	@Override
	public int compare(Sim o1, Sim o2) {
		// TODO Auto-generated method stub
		return o2.getBalance()-o1.getBalance();
	}
	
}
public class SimProgram {
	public static Sim[] matchAndSort(Sim s[],String circle,double rate) {
		Sim s1[]=new Sim[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].getCircle().equalsIgnoreCase(circle)&& s[i].getRatePerSecond()<rate) {
				s1=Arrays.copyOf(s1,s1.length+1);
				s1[s1.length-1]=s[i];
			}
		}
		MyComparator8 m=new MyComparator8();
		Arrays.sort(s1,m);
		return s1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Sim s[]=new Sim[4];
		for(int i=0;i<s.length;i++) {
			int id=scan.nextInt();
			scan.nextLine();
			String company=scan.nextLine();
			int balance=scan.nextInt();
			double ratePerSecond=scan.nextDouble();
			scan.nextLine();
			String circle=scan.nextLine();
			s[i]=new Sim(id,company,balance,ratePerSecond,circle);
		}
		String circle=scan.nextLine();
		double ratePerSecond=scan.nextDouble();
		Sim[] matchAndSort = matchAndSort(s,circle,ratePerSecond);
		for(Sim s1:matchAndSort) {
			System.out.println(s1.getId());
		}
	}

}
