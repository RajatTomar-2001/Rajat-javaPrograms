package java_programs;

public class PrintDuplicate {
	public static void main(String[] args) {
		int f=0;
		int arr[]=new int[] {10,28,87,10,20,76,28,80};
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate value is "+arr[i]);
					f++;
					break;
				}
				else {}
			}
		}
		if(f==0) {
			System.out.println("No Duplicate values present in the list");
		}
		
	}
}
