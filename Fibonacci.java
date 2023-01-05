package java_programs;

public class Fibonacci {

	public static void main(String[] args) {
      int i=0;
      int I_term=1;
      int II_term=2;
      
      int arr[]=new int[20];
      arr[0]=I_term;
      arr[1]=II_term;
      
      while(i<arr.length-2)
      {
    	  arr[i+2]=arr[i]+arr[i+1];
    	  
    	  i++;
      }
      
      i=0;
      System.out.println("Fibonnacci series is:");
      while(i<arr.length)
      {
    	 System.out.println(arr[i]);
    	 i++;
      }
     
	}

}
