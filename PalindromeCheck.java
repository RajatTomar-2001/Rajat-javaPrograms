package java_programs;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in );
	System.out.println("Enter a string to check");
	String s=sc.nextLine();
	int length=s.length();
	int i;
	
	for(i=0; i<length/2; i++) {
		if(s.charAt(i)!=s.charAt(length-i-1)) {
			System.out.println("String is not palindrome");
			break;
		}
		
	}
		if(i==length/2) {
		System.out.println("String is palindrome");}
	

}

}
