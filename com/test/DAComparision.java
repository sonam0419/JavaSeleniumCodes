package com.test;

import java.util.Scanner;

public class DAComparision {
	public static void main(String[] args) {
		int percent = 0;
		int DA;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary = scanner.nextInt();
		
		if(salary<=10000)
		{
			percent = 20;
		DA = (salary * percent)/100;
		System.out.println("DA will be calculated as 10%:" +DA);
		}
		
		else if(salary<=15000) {
			percent = 25;
			DA = (salary * percent)/100;
			System.out.println("DA will be calculated as 25%:" +DA);
		}
		else if(salary<=20000)
		{
			percent = 30;
		DA = (salary * percent)/100;
		System.out.println("DA will be calculated as 30%:" +DA);
		}
		
		else
		{
		//if(salary>20000)
			percent = 40;
		DA = (salary * percent)/100;
		System.out.println("DA will be calculated as 40%:" +DA);
		}
	}

}
