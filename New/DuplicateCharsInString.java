package New;

public class DuplicateCharsInString {
	public void dupCharString() {
	String str1 = "Sonam is my name";
	int i, j;
	
	for(i=0; i<str1.length(); i++) {
		for(j=i+1; j<str1.length(); j++) {
			if(str1.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j) && str1.charAt(i)!= ' ') {
				System.out.print("Duplicate char is: " +str1.charAt(i) + " ");
			}
		}
	}
			
	}
}
