package New;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}

}
