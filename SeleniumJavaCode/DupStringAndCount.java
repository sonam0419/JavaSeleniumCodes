package SeleniumJavaCode;

import java.util.HashMap;
import java.util.Map;

public class DupStringAndCount {
public static void main(String[] args) {
	String str = "Sonam is my name";
	findDuplicateCharacters(str);
}

public static void findDuplicateCharacters(String str) {
	Map<Character, Integer> frequency = new HashMap<>();
	char[] charArray = str.toCharArray();
	
	for(char c : charArray) {
		if(frequency.containsKey(c) && c!= ' ') {
			frequency.put(c, frequency.get(c)+1);
			}
		else {
			frequency.put(c, 1);
		}
	}
	
	System.out.println("Duplicate characters and their frequencies:");
	for(Character key : frequency.keySet()) {
		if (frequency.get(key) > 1) {
			System.out.println(key + " - " + frequency.get(key));
		}
		}
	}
	
	
}

