package java_programs;

import java.util.Scanner;

public class Recursion_Sum {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want to add");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		

	}
	static int sum(int x)
	{
		if(x==0)
		    return 0;
		else
			return (x + sum(x-1));
	}

}
