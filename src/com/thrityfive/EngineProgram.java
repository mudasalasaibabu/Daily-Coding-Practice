package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator5 implements Comparator<Engine>{

	@Override
	public int compare(Engine o1, Engine o2) {
		return o1.getEngineld()-o2.getEngineld();
	}

	
	
}
public class EngineProgram {
	public static int findAvgEnginePriceByType(Engine e[], String type) {
		int count=0,sum=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getEngineType().equalsIgnoreCase(type)) {
				count++;
				sum+=e[i].getEnginePrice();
			}
		}
		return sum/count;
	}
	
	public static Engine[] searchEngineByName(Engine e[],String name) {
		Engine e1[]=new Engine[0];
		for(int i=0;i<e.length;i++) {
			if(e[i].getEngineName().equalsIgnoreCase(name)) {
				e1=Arrays.copyOf(e1,e1.length+1);
				e1[e1.length-1]=e[i];
			}
		}
		MyComparator5 myComparator5 = new MyComparator5();
		Arrays.sort(e1,myComparator5);
		return e1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Engine e[]=new Engine[4];
		for(int i=0;i<e.length;i++) {
			int engineld = scan.nextInt();
			scan.nextLine();
			String engineName=scan.nextLine();
			String engineType=scan.nextLine();
			double enginePrice=scan.nextDouble();
			e[i]=new Engine(engineld,engineName,engineType,enginePrice);
		}
		scan.nextLine();
		String engineType=scan.nextLine();
		String engineName=scan.nextLine();
		int avgEnginePriceByType = findAvgEnginePriceByType(e,engineType);
		System.out.println(avgEnginePriceByType);
		Engine[] searchEngineByName = searchEngineByName(e,engineName);
		for(Engine s:searchEngineByName) {
			System.out.println(s.getEngineld());
		}
		
	}

}
