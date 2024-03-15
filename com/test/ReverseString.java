package com.test;

public class ReverseString 
{
  public static void main(String[] args) {
	String str1 = "sonam mishra";
	String str2 = "";
	System.out.println("Original String: " +str1);
	
	for(int i=0; i<str1.length(); i++)
	{
		str2 = str1.charAt(i) + str2;
	}
	
	System.out.println("Reversed String is: " +str2);
}
}
