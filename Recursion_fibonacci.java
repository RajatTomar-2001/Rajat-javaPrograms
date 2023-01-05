package java_programs;

import java.util.Scanner;

public class Recursion_fibonacci {

	public static void main(String[] args) {
	   
		/*System.out.println("Enter number of terms upto which you want fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(fibon(i));
		}*/
		int n=5;
		System.out.println(fibon(n));
       
	}
	static int fibon(int n)
	  {
		  if(n==1||n==2)
		     return 1;
		  else
			  return(fibon(n-1)+fibon(n-2));
			  
	  }
	
	

}
