package com.thrityfive;

import java.util.Arrays;
import java.util.Scanner;

public class CourseProgram {
	static Scanner scan=new Scanner(System.in);
//	public static Course[] addData(Course course) {
//		
//		return c;
//		
//	}
//	public static void display(Course course) {
//		Course c[]=CourseProgram.addData(course);
//		for(Course courses:c) {
//			System.out.println(courses);
//		}
//	}
//	
//	public static void getCourseAdminNames(Course course) {
//		Course c[]=CourseProgram.addData(course);
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i].getCourseAdmin());
//		}
//	}
	public static int findAvgOfQuizByAdmin(Course c[],String adminName) {
		int count=0;
		int sum=0;
		for(int i=0;i<c.length;i++) {
			String courseAdmin = c[i].getCourseAdmin();
			if(courseAdmin.equals(adminName)) {
				count++;
				sum+=c[i].getQuiz();
			}
		}
		if(count==0) {
			return 0;
		}
		return sum/count;
	}
	
	public static Course[] sortCourseByHandsOn(Course c[],int handson) {
		for(int x=0;x<c.length;x++) {
			for(int y=x+1;y<c.length;y++) {
				if(c[x].getHandson()>c[y].getHandson()) {
					Course temp=c[x];
					c[x]=c[y];
					c[y]=temp;
				}
			}
		}
		int j=0;
		for(int i=0;i<c.length;i++) {
			int hs = c[i].getHandson();
			if(handson>hs) {
				j++;
			}
		}
		if(j==0) {
			return null;
		}
		Course s[]=new Course[j];
		int k=0;
		for(int i=0;i<c.length;i++) {
			int hs = c[i].getHandson();
			if(handson>hs) {
				s[k++]=c[i];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Course c[]=new Course[4];
		for(int i=0;i<4;i++) {
			int cId=scan.nextInt();
			scan.nextLine();
			String cname=scan.nextLine();
			String name=scan.nextLine();
			int quiz=scan.nextInt();
			int handson=scan.nextInt();
			c[i]=new Course(cId,cname,name,quiz,handson);
		}
		int avg = findAvgOfQuizByAdmin(c,"Nisha");
		System.out.println("Avg quiz for this Nisha : "+avg);
		Course[] s = sortCourseByHandsOn(c,17);
		if(s==null) {
			System.out.println("No Course found with mentioned attribute.");
		}else {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].getCourseName());
		}
		}
	}
	

}
