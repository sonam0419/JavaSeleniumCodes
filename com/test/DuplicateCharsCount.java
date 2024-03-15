package com.test;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharsCount 
{
  public static void main(String[] args) {
	String str = "abhinavtestqwInterview";
	int count = 0;
	//char[] arr = str.toCharArray();
	List<Character> list = new ArrayList<>();
	for(int i=0; i<str.length(); i++)
	{
		if (list.contains(str.toLowerCase().charAt(i))) {
			continue;
		}
		for(int j=i+1; j<str.length(); j++)
		{
			if(str.toLowerCase().charAt(i)== str.toLowerCase().charAt(j) && str.charAt(i)!= ' ')
			{
				list.add(str.toLowerCase().charAt(i));
				System.out.println("Duplicate char is: " +str.toLowerCase().charAt(j));
			}			
		}
	}
}
}
