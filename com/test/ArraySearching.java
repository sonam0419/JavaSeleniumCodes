package com.test;

public class ArraySearching {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50};
		int searchElement = 30;
		
		for(int i=1; i<array.length; i++)
		{
			if(searchElement==array[i]) {
				System.out.println("Element if found at index: " +i);
				System.out.println("Element is: " +array[i]);
			    break;
			}
		}
	}

}
