package java_programs;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Half Pyramid
	    int n=4;
			for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//Inverse Half Pyramid
		System.out.println("\n");
			for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}



