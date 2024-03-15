package List;

public class AddArraysOfDifferentLength {
public static void main(String[] args) {
	int[] arr1 = {10, 20, 30};
	int[] arr2 = {11, 21, 31, 41};
	
	for(int i=0; i<(arr1.length<arr2.length?arr1.length:arr2.length); i++){
		arr1[i] = arr1[i] + arr2[i];
	}
	
	System.out.println(arr1);
}
}
