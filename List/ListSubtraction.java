package List;

import java.util.ArrayList;
import java.util.List;

public class ListSubtraction {
	public void listSubtraction() {
		List<Integer> l1 = new ArrayList<>();
		l1.add(30);
		l1.add(31);
		l1.add(32);
		l1.add(33);
		l1.add(34);
		System.out.println("Elements present in List1: " +l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l2.add(16);
		System.out.println("Elements present in List2: " +l2);
		
		List<Integer> l3 = new ArrayList<Integer>();
		int i;
		for(i=0; i<(l1.size()<l2.size()?l1.size():l2.size()); i++) {
			int sub = l1.get(i)-l2.get(i);
			l3.add(sub);
		}

        for(Integer element : (l1.size()>l2.size()?l1.subList(i, l1.size()):l2.subList(i, l2.size()))) {
        	l3.add(element);
        }
        System.out.println("Elements present in list3: " +l3);
		
	}

}
