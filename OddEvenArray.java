//Program to seperate odd and even elements of array 

package java_programs;

public class OddEvenArray {

	public static void main(String[] args) 
	{
		int arr1[]=new int[] {1,2,3,4,5,6,7,8};
		int arr2[]=new int[arr1.length];
		int j=arr1.length-1;
		int k=0;
		System.out.println(j);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(k>j)
			{
				break;
			}
			if(arr1[i]%2==0)
			{
				arr2[k]=arr1[i];
				k++;
			}
			else
			{
				arr2[j]=arr1[i];
				j--;
			}
		}
		System.out.println("New array is:");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
