package List;

import java.util.ArrayList;
import java.util.List;

public class ListSwapping {
	public void swappingLists() {
		List<Integer> s1 = new ArrayList<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		System.out.println("Elements present in list1: " +s1);
		
		List<Integer> s2 = new ArrayList<Integer>();
		s2.add(33);
		s2.add(45);
		s2.add(55);
		System.out.println("Elements present in list2: " +s2);
		
		int temp = 0;
		for(int i=0; i<s1.size(); i++) {
			temp = s1.get(i);
			s1.set(i, s2.get(i));
			s2.set(i, temp);
		}
		System.out.println("Elements present in List1 after swapping: " +s1);
		System.out.println("Elements present in List2 after swapping: " +s2);
	}

}
