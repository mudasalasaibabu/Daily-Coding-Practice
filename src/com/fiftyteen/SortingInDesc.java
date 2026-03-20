package com.fiftyteen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyCompartor implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}
public class SortingInDesc {
	public static void main(String[] args) {
		MyCompartor myCompartor = new MyCompartor();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = scan.nextInt();
		Integer[] a = new Integer[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the " + (i + 1) + " Element: ");
			a[i] = scan.nextInt();
		}
		Arrays.sort(a,myCompartor);
		for(int r:a) {
			System.out.print(r+" ");
		}
		System.out.println();

	}

}
