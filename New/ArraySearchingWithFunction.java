package New;

import java.util.Scanner;

public class ArraySearchingWithFunction {
	public int arraySearch() {
		
    int[] arr = {10, 45, 22, 34, 33};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the element you want to search: ");
    int b = scanner.nextInt();
    
    for(int i=0; i<arr.length; i++)
    {
    	if(arr[i] == b)
    	{
    		return i;
    	}
    }
	return -1;
	}
}
