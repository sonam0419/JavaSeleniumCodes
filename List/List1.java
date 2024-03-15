package List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public void listMethod() {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(40);
		list1.add(50);
		System.out.print("List1 Elements: ");
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.add(10);
		list2.add(12);
		list2.add(14);
		System.out.print("List2 Elements: ");
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>();
		int i;
		for(i=0; i<(list1.size()<list2.size()?list1.size():list2.size()); i++) {
			int sum = list1.get(i) + list2.get(i);
			list3.add(sum);
		}
		
		for(Integer element : (list1.size()>list2.size()?list1.subList(i, list1.size()):list2.subList(i, list2.size()))) {
			list3.add(element);
		}
		System.out.println("Sum of two list is: " +list3);
	}

}
