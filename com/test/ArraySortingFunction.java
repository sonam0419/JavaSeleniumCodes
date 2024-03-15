package com.test;

public class ArraySortingFunction
{
 public static void main(String[] args) 
 {
	int num1[] = {13, 12, 55, 23, 15};
	int n = num1.length;
	int temp = 0;
	
	
	for(int i=0; i<n; i++)
	{
		System.out.print( num1[i] + " ");
	}
	System.out.println("\n");
	
	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n-1; j++)
		{
		if(num1[j]>num1[j+1])
		{
			temp = num1[j];
			num1[j] = num1[j+1];
			num1[j+1] = temp;
		}
		}
	}
	for(int i=0; i<n; i++)
	{
		System.out.print( num1[i] + " ");
	}
}
}
