//Program to find the longest common subsequence(LCS) of two strings

package java_programs;

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.next();                                //abaaba/2
		
		System.out.println("Enter second string");
		String s2=sc.next();								//babbab
		String tmp_lcs="";
		String lcs="";
		char x[]=s1.toCharArray();
		char y[]=s2.toCharArray();		 //converting string to char array
		
		int count=0;                      //count variable to count length of common subsequence
		int temp=0;						//temp variable to control loop  compared string
		int k=0;
		
		while(k<s1.length())
		{
		for(int i=k;i<s1.length();i++)
		{
			
			for(int j=temp;j<s2.length();j++)
			{
				
				if(x[i]==y[j])				//comparing every character of first string to all the remaining characters of second string which are still not matched 
				{
					tmp_lcs+=x[i];
					temp=j+1;
					//count+=1;
					break;
				}
			}
		
		}
		if(lcs.length()<tmp_lcs.length()) 
		{
			lcs=tmp_lcs;
		}
		tmp_lcs="";
		temp=0;
		k++;
		}
		count=lcs.length();		
		if(count==0)
			System.out.println("No common subsequence");
		else
			System.out.println("Longest common subsequence is ("+lcs+") whose length is "+count);
	
		
	
	}

}
