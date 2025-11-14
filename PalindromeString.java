package StringProgram;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "TiTm";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("The rev string is: " + rev);

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome");

		}
	}

}
