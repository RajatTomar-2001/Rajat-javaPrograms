package java_programs;

public class PatternProblems {

	public static void main(String[] args) {
/*	
		
type1:-          1
		        2 2
		       3 3 3
		      4 4 4 4
		     5 5 5 5 5
		    6 6 6 6 6 6 
		   7 7 7 7 7 7 7
		  8 8 8 8 8 8 8 8
		 9 9 9 9 9 9 9 9 9
*/	
		int k=9;
		for(int i=1;i<=k;i++) {
			int s=1;																			
			while(s<=k-i) {																	   
				System.out.print(" ");														
				s++;																	      
			}
			for(int j=1;j<=i;j++) {
			
				System.out.print(i+" ");
			}
			System.out.println();
			/*if(i==k) {
				int j=k-1;
				while(i>1) {
					
					System.out.print(j+" ");
					i--;
				}
			}*/
		}}
}
/*
-----------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
		
type2:-			    1
				  1 2 1
				1 2 3 2 1
			  1 2 3 4 3 2 1
			1 2 3 4 5 4 3 2 1
		  1 2 3 4 5 6 5 4 3 2 1 
		1 2 3 4 5 6 7 6 5 4 3 2 1			 
	  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
	1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
	
*/	
	/*int k=9,n=0;
		for(int i=1;i<=k;i++) {
		int s=1;																			
			while(s<=2*(k-i)) {																	   
				System.out.print(" ");														
				s++;																	      
			}
			for(int j=1;j<=i+n;j++) {
				if(j<=i) {
					System.out.print(j+" ");}
				else {
					while(n!=0) {
					System.out.print(n+" ");
					n=n-1;}}
			 // while(n>=1) {
			    
			 }
			 n=i;
			System.out.println();
		}

	}

}*/

		
	


