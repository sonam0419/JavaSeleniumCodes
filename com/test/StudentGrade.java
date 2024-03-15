package com.test;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args)
	{
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = scanner.nextInt();
		if(marks>0 && marks<35)
		{
			System.out.println("Grade E");
		}
		else if(marks>=35 && marks<50)
		{
			System.out.println("Grade D");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("Grade C");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("Grade B");
		}
		else if(marks>=75 && marks<90)
	    {
		    System.out.println("Grade A");
	    }
	    else if(marks>=90 && marks<=100)
	    {
			System.out.println("Grade A++");
		}
	}
	
		

}
