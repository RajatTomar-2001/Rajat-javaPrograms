package java_programs;

public class MaxInMatrix {

	public static void main(String[] args) {
	int max=-1;
	if(args.length!=9)
	{
		System.out.println("Give 9 arguments at command line");
	}
	else
	{
		for(int i=0;i<args.length;i++)
		{
			if(i%3==0 && i!=0)
			{
				System.out.println("");
			}
			
			System.out.print(args[i]+" ");
			if(Integer.parseInt(args[i])>max)
			{
				max=Integer.parseInt(args[i]);
			}
		}
		System.out.println("\nMaximum element is: "+max);
	}

	}

}
