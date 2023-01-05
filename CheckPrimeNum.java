package java_programs;

public class CheckPrimeNum {
	
	public static boolean checkNum(int num) {
		int flag=0;
	
		for(int i=2;i<num/2;i++) {
			if(num==2) {return true;}
			
			else if(num%i==0) {
				flag=1;
			}
		}
			if(flag==1) {return false;}
			else {return true;}
}
	public static void main(String[] args) {
		int i=2;
		System.out.println(checkNum(i));

	}

}
