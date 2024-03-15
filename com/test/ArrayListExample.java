package com.test;

import java.util.ArrayList;

public class ArrayListExample 
{
   public static void main(String[] args) {
	ArrayList<String> l1 = new ArrayList<String>();
	l1.add("Mishra");
	l1.add("Sonam");
	l1.add("Here");
 
	System.out.println("Elements present in the arraylist are: ");
	for(String elem : l1)
	{
		System.out.println(elem);
	}
	
	System.out.println("Elements of the arraylist: " +l1);
	System.out.println("Size of the arraylist: " +l1.size());
	
	//To add the element in the arraylist
	System.out.println("Adding new element: ");
	l1.add(1, "Grapes");
	System.out.println("After adding one more element to the array: " +l1);
	
	//To remove the element from the arraylist
		System.out.println("Removing one element: ");
		l1.remove(3);
		System.out.println("After removing one element from the array: " +l1);
		
	//To check whether element present in the arraylist
		System.out.println("Element Sonam is present in the arraylist? " +l1.contains("Sonam"));
		
	
	
}
}
