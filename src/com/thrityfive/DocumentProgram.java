package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class DocumentProgram {
	
	public static Document[] docsWithOddPages(Document d[]) {
		Document d1[]=new Document[0];
		for(int i=0;i<d.length;i++) {
			if(d[i].getPages()%2!=0) {
				d1=Arrays.copyOf(d1,d1.length+1);
				d1[d1.length-1]=d[i];
			}
		}
		return d1;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Document d[]=new Document[4];
		for(int i=0;i<d.length;i++) {
		int id=	scan.nextInt();
		scan.nextLine();
		String title=scan.nextLine();
		String folderName=scan.nextLine();
		int pages=	scan.nextInt();
		d[i]=new Document(id,title,folderName,pages);
		}
		Document[] dop = docsWithOddPages(d);
		for(Document d2:dop) {
			System.out.println(d2.getId()+" "+d2.getTitle()+" "+d2.getFolderName()+" "+d2.getPages());
		}

	}

}
