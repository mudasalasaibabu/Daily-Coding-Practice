package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyComparator10 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getScore(),o1.getScore());
	}
	
}
public class StudentProgram {
	public static int findCountOfDayscholarStudents(Student s[]) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].getScore()>80 && s[i].isDayScholar()==true) {
				count++;
			}
		}
		return count;
	}
	
	public static Student findStudentwithSecondHighestScore(Student s[]) {
		Student s1[]=new Student[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].isDayScholar()==false) {
				s1=Arrays.copyOf(s1,s1.length+1);
				s1[s1.length-1]=s[i];
			}
		}
		MyComparator10  m=new MyComparator10 ();
		Arrays.sort(s1,m);
		if(s1.length>1) {
			return s1[1];
		}else {
			return null;
		}
		}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student s[]=new Student[4];
		for(int i=0;i<s.length;i++) {
			int rollNo=scan.nextInt();
			scan.nextLine();
			String name=scan.nextLine();
			String branch=scan.nextLine();
			double score =scan.nextDouble();
			boolean dayScholar=scan.nextBoolean();
			s[i]=new Student(rollNo,name,branch,score,dayScholar);
		}
		int countOfDayscholarStudents = findCountOfDayscholarStudents(s);
		Student shs = findStudentwithSecondHighestScore(s);
		System.out.println(countOfDayscholarStudents);
		System.out.println(shs.getRollNo()+"#"+shs.getName()+"#"+shs.getScore());
		
	}

}
