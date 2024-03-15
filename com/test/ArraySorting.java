package com.test;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] numbers = {22, 44, 11, 10, 56};
		printArray(numbers);
		
		Arrays.sort(numbers);
		//After sorting
		printArray(numbers);
	}
		public static void printArray(int[] arr)
		{
			for(int num : arr)
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}
	

}
