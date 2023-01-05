package java_programs;

import java.util.Arrays;
import java.util.*;

public class CompareArray_Elem {

	public static void main(String[] args) {
		Integer arr1[]=new Integer[] {2,3,1,5,1};
		Integer[] arr2=new Integer[] {1,2,3};
		
		System.out.println(checkArray(arr1,arr2));
	}
	public static boolean checkArray(Integer []ar1,Integer[]ar2)
	{
		Set<Integer> s1=new HashSet<>(Arrays.asList(ar1));        //set contains only unique elements and not accept duplicate elements
		Set<Integer> s2=new HashSet<>(Arrays.asList(ar2));
		System.out.println(s1);
		if(s1.size()!=s2.size()) {
			return false;
		}
		for(Integer i:s2) {
			if(!s1.contains(i)) {
				return false;
			}
		}
		return true;
				
			
	}

}
