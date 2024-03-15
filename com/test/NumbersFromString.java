package com.test;

public class NumbersFromString {
	public static void main(String[] args) {
		String str = "So9n32a8m";
		StringBuilder sb = new StringBuilder();
		int num = 0;
	for(int i = 0; i<str.length()-1; i++)
	{
		if(str.charAt(i)>=48 && str.charAt(i)<=57)
		{
			sb.append(str.charAt(i));
			num = num + Character.getNumericValue(str.charAt(i));
		}
		
	}
	System.out.println(sb);
	System.out.println(num);
	}

}
