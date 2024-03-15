package com.test;

public class Palindrome {
           public static void main(String[] args) {
			String str = "Kanak";
			StringBuilder sb = new StringBuilder();
			String str2 = "";
			for(int i = str.length()-1; i>=0; i--)
			{
				sb.append(str.charAt(i));
		}
			System.out.println(sb);
			if(str.toLowerCase().equals(sb.toString().toLowerCase())) {
				System.out.println("palindrome");
			}
		}
}
