package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class PowerSet {
	
	static void pow_set(StringBuilder str)
	{
		String p_set="";
		int len=str.length();
		System.out.print("{");
		for(int n=0;n<=(Math.pow(2, len)-1);n++)
		{
			for(int i=0;i<=len-1;i++)
			{
				
				if((n&1<<i)!=0)								//binary of n (bitwise and '&' operation) 001,010,100  
				{
					p_set+=str.charAt(i);
				}
			}
			System.out.print("{"+p_set+"}");
			p_set="";
		}
		System.out.print("}");
		
	}

	public static void main(String[] args) 
	{
		int i=0;
		String s1="";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		StringBuilder set=new StringBuilder(s1);
		while(i<set.length())
		{
			if(set.charAt(i)=='}'|| set.charAt(i)==' '|| set.charAt(i)==',' || set.charAt(i)=='{') 
			{
				set.deleteCharAt(i);
			}
			i++;
		}
		pow_set(set);
		//String []arr=new String[] {"{a}","{b}","{ab}","{c}"};
		//Arrays.sort(arr);
	//	for(String s:arr)
		//{
			//System.out.println(s);
	//	}
	}
}

