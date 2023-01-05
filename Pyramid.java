package java_programs;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1;i<=n;i++) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			for( j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("*");
				}
				else {
				  System.out.print("**");
				}
			 }
			System.out.println("");
		}
			


}
}
	