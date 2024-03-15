package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringInList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sonam");
		list.add("Vedant");
		list.add("Heraj");
		list.add("Vedanshi");
		System.out.println(list);
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j=0; j<list.size()-1; j++) {
				if(list.get(j).compareTo(list.get(j+1))>0) {
					String temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println("Sorted list: " +list);
	}
}
