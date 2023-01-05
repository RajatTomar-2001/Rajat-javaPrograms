package java_programs;

import java.util.Scanner;

public class HeartPattern {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name");
			String str=sc.nextLine();
			int len=str.length();
			int n=20;
			for(int i=n/2; i<=n;i+=2) 
			{
				for(int j=1;j<n-i;j+=2)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				
				for(int j=1;j<n-i;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				
				System.out.println();
				
			}  
			//Now printing Reverse Triangle
			int s=1;
			for(int i=2*n; i>=0;i-=2) 
			{
				for(int j=1; j<=i;j++) 
				{
					if(j==(n)&& i==(2*n))
					{
						System.out.print(str);
						j+=len-1;
					}
					else
					System.out.print("*");
				}
				
				System.out.println();
				
				for(int k=0;k<s;k++)
				{
					System.out.print(" ");
				}
				s++;
			}
			
		}
	}

