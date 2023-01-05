package java_programs;

import java.util.Scanner;

public class Check_Leap_Year {

	public static void main(String[] args) {
		System.out.print("Enter Year");
		Scanner sc=new Scanner(System.in);
		int year= sc.nextInt();
		boolean result=checkLeapYear(year);
		if(result==true)
		{
			System.out.print("Entered year is leap year");
		}else
		    System.out.print("Entered year is not leap year");
		  
		}
	
    static boolean checkLeapYear(int year)
     {
    	 if(year%4==0)        //condition for checking leap year is:- (if given year is divided by 4 than leap year otherwise not.)
    	 {
    		 return true;
    	 }
    	 return false;
     }
}
