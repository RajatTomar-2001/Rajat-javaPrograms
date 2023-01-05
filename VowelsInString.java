package java_programs;

public class VowelsInString {

	public static void main(String[] args) {
		String str="Welcome";
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("Yes! string contains vowels");
		} 
		else {
			System.out.println("No! string does not contains vowels");
		}

	}

}
