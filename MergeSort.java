package java_programs;

public class MergeSort {
	
	static void merge(int arr[],int l,int mid,int r) {
		
		for(int i=0;i<8;i++) {
			System.out.print("  "+arr[i]);
		}
		System.out.println("");
		
		
		int n1=mid-l+1;
		int n2=r-mid;
		
		int a[]=new int[n1];
		int b[]=new int[n2]; //temporary arrays for merging
		
		for(int i=0;i<n1;i++) {
			a[i]=arr[l+i];
		}
 
		for(int i=0;i<n2;i++) {
			b[i]=arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(a[i]<b[j]) {
				arr[k]=a[i];
				k++; i++;
			}
			else {
				arr[k]=b[j];
				k++; j++;
			}
		}
		
		while(i<n1) {
			arr[k]=a[i];
			k++; i++;
		}
		
		while(j<n2) {
			arr[k]=b[j];
			k++; j++;
		}
	}
	
	static void mergeSort(int arr[],int l,int r) {
		if(l<r)
		{
			int mid=(l+r)/2;
			
			mergeSort(arr,l,mid);                //break the array till the mid value
			
			mergeSort(arr,mid+1,r);             //break the array from the (mid-value+1) to last value
			
			merge(arr,l,mid,r);                 //merge method to merge the sorted array
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,3,9,5,2,8,7,1};
		mergeSort(arr,0,7);
		
		for(int i=0;i<8;i++) {
			System.out.print("  "+arr[i]);
		}
		
	}

}
