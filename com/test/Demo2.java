package com.test;

public class Demo2 {
	public static void main(String[] args) {
		String str = "sonam mishra";
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i>=1; i--)
		{
			if(str.charAt(i-1) == ' ')
			{
				sb.append(str.toUpperCase().charAt(i));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		sb.append(str.toUpperCase().charAt(0));
		System.out.println(sb);
	}

}
