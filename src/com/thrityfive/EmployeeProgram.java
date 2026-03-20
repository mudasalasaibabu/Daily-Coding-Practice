package com.thrityfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class MyCompartor implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getRating()-o2.getRating());
	}
	
}

public class EmployeeProgram {
	
	public static int findCountOfEmployeeCompTransport(Employee emp[],String branch) {
		int count=0;
		for(int i=0;i<emp.length;i++) {
			if(emp[i].isCompanyTransport()==true && emp[i].getBranch().equals(branch) ) {
				count++;
			}
		}
		return count;
	}
	
	public static Employee findEmployeeWithSecondHighestRating(Employee emp[]) {
		MyCompartor myCompartor=new MyCompartor();
		Employee e[]=new Employee[0];
		for(int i=0;i<emp.length;i++) {
			if(emp[i].isCompanyTransport()==false) {
				e=Arrays.copyOf(e,e.length+1);
				e[e.length-1]=emp[i];
			}
		}
		Arrays.sort(e,myCompartor);
		Employee employee = e[e.length-2];
		return employee;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Employee emp[]=new Employee[4];
		for(int i=0;i<4;i++) {
			int id=scan.nextInt();
			scan.nextLine();
			String name=scan.nextLine();
			String branch=scan.nextLine();
			double rating=scan.nextDouble();
			boolean companyTransport=scan.nextBoolean();
			emp[i]=new Employee(id,name,branch,rating,companyTransport);
			
		}
		scan.nextLine();
		int count=findCountOfEmployeeCompTransport(emp,scan.nextLine());
		System.out.println(count);
		Employee employeeWithSecondHighestRating = findEmployeeWithSecondHighestRating(emp);
		System.out.println(employeeWithSecondHighestRating.getEmpoyeeId());
		System.out.println(employeeWithSecondHighestRating.getName());
		
	}

}
