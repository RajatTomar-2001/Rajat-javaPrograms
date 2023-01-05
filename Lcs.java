package java_programs;

public class Lcs {
	static int i=0,j=0;
	static String lcs(int len1,int len2,String str1,String str2)
	{   
		int arr[][]=new int[len1+1][len2+1];
		for(i=0;i<=len1;i++)
		{
			for(j=0;j<=len2;j++)
			{
				if(i==0 || j==0)
				{
					arr[i][j]=0;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					arr[i][j]=1+arr[i-1][j-1];
				}
				else
				{
					arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
				}
			}
		}
		i=len1;
		j=len2;
		int index=arr[len1][len2];
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		String comstr="";
		String tempstr="";
		//char commstr[]=new char[index+1];
		//commstr[index]='\0';
		while(i>0 && j>0)
		{
			if(s1[i-1]==s2[j-1])
			{
				//commstr[index-1]=s1[i-1];
				tempstr=tempstr+s1[i-1];
				i--;j--;index--;
			}
			else if(arr[i-1][j]>arr[i][j-1])
			{
				i--;
				if(tempstr.length()>comstr.length())
					comstr=tempstr;
			}
			else {
				j--;
				if(tempstr.length()>comstr.length())
				comstr=tempstr;}
		}
		System.out.println("Length of common substring is "+arr[len1][len2]);
		return comstr;
	  }
	
	public static void main(String[] args) {
		String s1="abcdefg";
		String s2="abcdegg";
		int l1=s1.length();
		int l2=s2.length();
		String str=lcs(l1,l2,s1,s2);
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println("Common substring is "+sb);
	}
 }

