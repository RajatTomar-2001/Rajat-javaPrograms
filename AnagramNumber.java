package java_programs;

import java.util.Scanner;

public class AnagramNumber {

	public static void main(String[] args) {
		int low=0,digit=0,x=0,result=0;
		int high=0;
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Enter low range");
			low=sc.nextInt();
			x=low;
			System.out.println("Enter high range");
			high=sc.nextInt();
		}
		//System.out.println(result);
		while(low!=0)
		{
			low=low/10;
			digit++;
			//System.out.println(low);
		}
		//System.out.println(digit);
		
		/*for(int i=low;i<=high;i++)
		{
			
			low=x;
			//System.out.println(low);
			while(low!=0)
			{
				int rem=0;
				rem=low%10;
				result+=Math.pow(rem,3);
				low/=10;
				System.out.println(low);
			}
			//System.out.println(result);
		    if(result==i)
			{
				//System.out.println("result is "+result);
			}
		    digit=0;
			result=0;
			
		}*/
	}

}
