//How to reverse a String in Java?

package java_programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Welcome";
		System.out.println(str.length());
		char[] carr=str.toCharArray();
		StringBuilder out=new StringBuilder();
		
		for(int i=str.length()-1; i>=0;i-- ) {
		  out.append(carr[i]);
		}
		System.out.println(out.toString());
		
	}

}
