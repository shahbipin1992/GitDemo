package NumberProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 101;
		int rem;
		int rev = 0;
		int temp = num;

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("A Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
