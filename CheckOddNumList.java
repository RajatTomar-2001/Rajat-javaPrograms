//Checking if  list contains only odd numbers

package java_programs;

import java.util.Scanner;

public class CheckOddNumList {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter List");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=0,flag=0;
		while(j<arr.length-1) {
			if(arr[j]%2==0) {
			}
			else {flag=1; break;}
			j++;
		}
		if(flag==1) {
			System.out.println("List Contains Odd Numbers");
		}
		else {System.out.println("List does not Contains Odd Numbers");}
		
	}

}
