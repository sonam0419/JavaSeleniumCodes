package com.test;

import java.util.Scanner;

public class CalculateNumberOfDaysSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int month = scanner.nextInt();
		
		//int days;
		
		switch(month)
		{
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days is 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days is 30");
			break;
		case 2:
			System.out.println("Number of days is 28");
			break;
		default:
			System.out.println("Invalid month entered...");
			return;
		}
		//System.out.println("Number of days in the month: " +days);
		//scanner.close();
	}

}
