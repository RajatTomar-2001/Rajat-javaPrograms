//FInding the second highest element in array
package java_programs;

import java.util.*;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int arr[]=new int[] {1,3,2,4,6,7};
		/*Integer arr[]=new Integer[] {1,3,2,4,6,7};
		Set<Object> s1= new HashSet<>(Arrays.asList(arr));
		System.out.println(s1.size());
		Object arr1[]=s1.toArray();
		System.out.println("Second largest element is " +(arr1.length));*/
		
		Arrays.parallelSort(arr);
		System.out.println("Second largest element is " +(arr[arr.length-2]));
		
		
	}

}
