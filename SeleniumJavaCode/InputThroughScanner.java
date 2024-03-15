package SeleniumJavaCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputThroughScanner {
	public static void main(String[] args) {
		String username = "";
		String password = "";
		String url = "http://www.gmail.com/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		System.out.println("Enter password: ");
		do {
			username = sc.nextLine();
			password = sc.nextLine();
		} while(!username.equals("xyz") && !password.equals("xyz"));
		sc.close();
		int count = successLoginCount(url, username, password);
		System.out.println("Total successful login(s) are: " +count);
	}
	public static int successLoginCount(String url, String username, String password) {
		int successCount = 0;
		
		for(int i=0; i<username.length(); i++) {
			if(isValidLogin(url, username, password)) {
				successCount++;
			}
		}
		return successCount;
		 
	}
	public static boolean isValidLogin(String url, String username, String password) {
		return true;
	}
	

}
