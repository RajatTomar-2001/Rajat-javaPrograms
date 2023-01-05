package java_programs;

public class Factorial_rec {

	public static void main(String[] args) {
		int f=3;
		System.out.println(factorial(f));
	}
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}

}
