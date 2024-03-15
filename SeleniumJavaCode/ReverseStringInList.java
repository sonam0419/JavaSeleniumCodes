package SeleniumJavaCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringInList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<String>();
		list.add("Sonam");
		list.add("Heraj");
		list.add("Vedant");
		list.add("Vedanshi");
		System.out.println("Original List items: " +list);
		
		for (int i = list.size() - 1; i>=0; i--) {
			list.add(list.remove(i));
		}
		System.out.println("Reversed List: " +list);
	}

}
