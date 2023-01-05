//This MergeSort algo.  is more appropriate

package java_programs;

public class MergeSort1 {
	
	public static void divide(int arr[],int lb,int ub) {
			if(lb>=ub) {				//if lower bound is greater than upper bound then return control
			return;
			}
			int mid=(lb+ub)/2;	  //finding mid value
			
			divide(arr,lb,mid);		//divide method run until lb and mid values become same
			divide(arr,mid+1,ub);   
			merge(arr,lb,mid,ub);	//this method calls merge method for sorting of divided elements
		}
	
	public static void merge(int arr[],int lb,int mid,int ub) {
		int temparr[]=new int[ub-lb+1];
		int k=0;
		int i=lb;
		int j=mid+1;
		
		while(i<=mid && j<=ub) {			//sorting of elements
			if(arr[i]<=arr[j]) {
				temparr[k]=arr[i];
				i++;k++;
			}
			else {
				temparr[k]=arr[j];
				j++;k++;
			}
		}
		
		//now creating while loop for entering all the remaining elements in sorted array 
		    while(i<=mid) {				
				temparr[k++]=arr[i++];
				//j++;k++;
			}
		
				while(j<=ub) {
					temparr[k++]=arr[j++];
					//i++;k++;
			}
	
		for(i=0, j=lb; i<temparr.length;i++,j++) {
			arr[j]=temparr[i];				//copy sorted temporary array into original array
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,3,4,9,12,15};
		int lb=0;
		int ub=arr.length-1;
		//System.out.println(ub);
		divide(arr,lb,ub); 				 //calling divide method initially by passing original array,lower bound and upper bound
		

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);			//printing sorted array
		}
		
		
	}

}
