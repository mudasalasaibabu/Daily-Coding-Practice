package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class NavalVesselProgram {
	
	public static int findAvgVoyagesByPct(NavalVessel nv[],int percentage) {
		int sum=0,count=0;
		for(int i=0;i<nv.length;i++) {
			int per=nv[i].getNoOfVoyagesCompleted()*100/nv[i].getNoOfVoyagesPlanned();
			if(per>=percentage) {
				count++;
				sum+=nv[i].getNoOfVoyagesCompleted();
			}
		}
		return sum/count;
	}
	
	public static NavalVessel[] findVesselByGrad(NavalVessel nv[],String purpose) {
		NavalVessel nv1[]=new NavalVessel[0];
		for(int i=0;i<nv.length;i++) {
			if(nv[i].getPurpose().equalsIgnoreCase(purpose)) {
				nv1=Arrays.copyOf(nv1,nv1.length+1);
				nv1[nv1.length-1]=nv[i];
			}
		}
		return nv1;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		NavalVessel nv[]=new NavalVessel[4];
		for(int i=0;i<nv.length;i++) {
			int vesselId=scan.nextInt();
			scan.nextLine();
			String vesselName=scan.nextLine();
			int noOfVoyagesPlanned=scan.nextInt();
			int noOfVoyagesCompleted=scan.nextInt();
			scan.nextLine();
			String purpose=scan.nextLine();
			nv[i]=new NavalVessel(vesselId,vesselName,noOfVoyagesPlanned,noOfVoyagesCompleted,purpose);
		}
		int per=scan.nextInt();
		scan.nextLine();
		String purp=scan.nextLine();
		int avgVoyagesByPct = findAvgVoyagesByPct(nv,per);
		System.out.println(avgVoyagesByPct);
		NavalVessel[] vesselByGrad = findVesselByGrad(nv,purp);
		for(NavalVessel v:vesselByGrad) {
			int pers=v.getNoOfVoyagesCompleted()*100/v.getNoOfVoyagesPlanned();
			if(pers==100) {
				System.out.println(v.getVesselName()+"%Star");
			}else if(pers>=80 && pers<=99) {
				System.out.println(v.getVesselName()+"%Leader");
			}else if(pers>=55 && pers<=79) {
				System.out.println(v.getVesselName()+"%Inspirer");
			}else {
				System.out.println(v.getVesselName()+"%Striver");
			}
		}
	}

}
