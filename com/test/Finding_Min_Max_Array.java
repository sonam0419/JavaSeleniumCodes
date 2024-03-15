package com.test;

public class Finding_Min_Max_Array {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
			
			if(numbers[i] < min)
			{
				min = numbers[i];
			}
			
		}
		System.out.println("Maximum number of this array is: " +max);
		System.out.println("Minimum number of this array is: " +min);
	}

}
