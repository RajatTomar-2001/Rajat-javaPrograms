package java_programs;

public class NumberPalindrome {

	public static void main(String[] args) {
		int sum=0,y=0,x=121,z;
		z=x;
		while(x>0)
		{
		 y=x%10;
		 
		 sum=(sum*10)+y;
		 x=x/10;
		}
		if(sum==z)
		System.out.println(sum+" Palindrome");
		else
		System.out.println(sum+" Not a palindrome");
	}

}
