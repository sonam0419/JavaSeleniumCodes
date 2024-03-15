package com.test;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharInString 
{
  public static void main(String[] args) {
	String str = "abhinavtestqwInterview";
	//char[] arr = str.toCharArray();
	List<Character> list = new ArrayList<>();
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<str.length(); i++)
	{
		if (list.contains(str.toLowerCase().charAt(i))) {
			//continue;
		}
		if (sb.toString().contains(String.valueOf(str.toLowerCase().charAt(i)))) {
			continue;
		}
		
		for(int j=i+1; j<str.length(); j++)
		{
			if(str.toLowerCase().charAt(i)== str.toLowerCase().charAt(j) && str.charAt(i)!= ' ')
			{
				//list.add(str.toLowerCase().charAt(i));
				sb.append(str.toLowerCase().charAt(i));
				System.out.println("Duplicate char is: " +str.toLowerCase().charAt(j));	
			}
			
		}
	}
}
}
