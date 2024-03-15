package com.test;

public class FindMaximumNumber {
	
	public static void main(String[] args)
	{
	int a = 10;
	int b = 20;
	int c = 15;
	
	if(a>c && a>b)
	{
		System.out.println("The biggest number is: " +a);
	}
	else if(b>c)
	{ 
		System.out.println("The biggest number is: " +b);
	}
	else
		System.out.println("The biggest number is c: " +c);

}
}