package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MyComparator2 implements Comparator<Antenna>{

	@Override
	public int compare(Antenna o1, Antenna o2) {
		
		return Double.compare(o1.getAntennaVSWR(), o2.getAntennaVSWR());
	}
	
}
public class AntennaProgram {
	public static int searchAntennaByName(Antenna a[], String antennaName) {
		int aId=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].getAntennaName().equalsIgnoreCase(antennaName)) {
				aId=a[i].getAntennaId();
			}
		}
		return aId;
	}
	
	public static Antenna[] sortAntennaByVSWR(Antenna a[],double antennaVSWR) {
		Antenna a1[]=new Antenna[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].getAntennaVSWR()<antennaVSWR) {
				a1=Arrays.copyOf(a1,a1.length+1);
				a1[a1.length-1]=a[i];
			}
		}
		MyComparator2 myComparator = new MyComparator2();
		Arrays.sort(a1,myComparator);
		return a1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Antenna a[]=new Antenna[4];
		for(int i=0;i<a.length;i++) {
			int antennaid = scan.nextInt();
			scan.nextLine();
			String antennaName=scan.nextLine();
			String projectLead=scan.nextLine();
			double antennaVSWR=scan.nextDouble();
			a[i]=new Antenna(antennaid,antennaName,projectLead,antennaVSWR);
		}
		scan.nextLine();
		String antennaName=scan.nextLine();
		double antennaVSWR=scan.nextDouble();
		int searchAntennaByName = searchAntennaByName(a,antennaName);
		if(searchAntennaByName!=0) {
		System.out.println(searchAntennaByName);
		}else {
			System.out.println("There is no antenna with given parameter");
		}
		Antenna[] sortAntennaByVSWR = sortAntennaByVSWR(a,antennaVSWR);
		if(sortAntennaByVSWR.length >0) {
		for(Antenna s:sortAntennaByVSWR) {
			System.out.println(s.getProjectLead());
		}
		}else {
			System.out.println("No Antenna found");
		}
	}

}
