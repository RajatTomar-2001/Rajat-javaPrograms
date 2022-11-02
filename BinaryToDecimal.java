package java_programs;


public class BinaryToDecimal {
	
	
	static double convert(int x)
	{
		int rem; double dec=0;int i=0;
		while(x!=0)
		{
			rem=x%10;
			x=x/10;
			dec+=rem*(Math.pow(2, i));
			i++;
		}
		return dec;
	}

	public static void main(String[] args) {
		int x=11,y=10;    //decimal is 3
		String s="";
		double a=convert(x);
		double b=convert(y);
		System.out.println("Decimal Conversion is "+a);
		System.out.println("Decimal Conversion is "+b);
		System.out.println("Sum is "+(a+b));
		
		

	}

}
