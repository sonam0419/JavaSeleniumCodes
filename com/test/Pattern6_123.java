package com.test;

public class Pattern6_123 {
	     public static void main(String[] args) {
			int i, j;
			int n=3;
			
			for(i=1; i<=n; i++)
			{
				for(j=1; j<=i; j++)
				{
						System.out.print(i);	
				}
				System.out.println("");
			}
			
			for(i=n-1; i>=1; i--)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print(i);
				}
				System.out.println("");
			}
		}

}
