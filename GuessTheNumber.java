package java_programs;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args)
	{
		/*Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int num=rand.nextInt(100)+1;
		System.out.println("random number is "+num);*/
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		char user_input;
		int i=1;
		while(i<=64)
		{
			int j=1;
			while(j<=100)
			{
				if((j|i)==j)
					System.out.print(j+" ");
				j++;
			}
			System.out.println("");
			System.out.println("Is your number exists in the list:'y' or 'n' ");
			user_input=sc.nextLine().charAt(0);
			user_input=Character.toLowerCase(user_input);
			if(user_input=='y')
				{num+=i;}
			i*=2;
		}
		System.out.println("Your number is: "+num);
		
    }
}
