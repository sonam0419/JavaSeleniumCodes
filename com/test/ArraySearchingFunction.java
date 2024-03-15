package com.test;

import java.util.Scanner;

public class ArraySearchingFunction 
{
   public static void main(String[] args) {
	int i;
	int a[] = {1, 4, 9, 11, 15};
	boolean flag = false;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number which you want to find in the array: ");
	int b = scanner.nextInt();
	
	for(i=0; i<a.length-1; i++)
	{	
		if(a[i] == b)
		{
			flag = true;
			System.out.println("Element found in array: " +a[i]);
			break;
		}
	}
	if(!flag)
	{
		System.out.println("Element is not present in the array");
	}
}
}
