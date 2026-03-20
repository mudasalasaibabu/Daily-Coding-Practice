package com.fiftyteen;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static int [] PrimeNumbers(int a[]) {
		int res[]=new int[0];
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
				count++;
			}
			}
			if(count==2) {
				res=Arrays.copyOf(res,res.length+1);
				res[res.length-1]=a[i];
			}
			}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the " + (i + 1) + " Element: ");
			a[i] = scan.nextInt();
		}
		int[] p = PrimeNumbers(a);
		for(int r:p) {
			System.out.print(r+" ");
		}
		System.out.println();
	}

}
