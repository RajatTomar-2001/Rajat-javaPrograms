package java_programs;

public class InversePyramidrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Half Pyramid
				int n=4;
				
				for(int i=1;i<=n;i++) {
					int j=1;
					while(j<i) {
						System.out.print(" ");
						j++;
					}
					for( j=n;j>=i;j--) {
						
							System.out.print("*");
						
						}
					 }
					System.out.println("");
				}
					
	}


