package StringProgram;

import java.util.Arrays;

public class AngramString {

	public static void main(String[] args) {
		String s1 = "GRab";
		String s2 = "Brag";
		String s11 = s1.toLowerCase();
		String s22 = s2.toLowerCase();
		char[] s111 = s11.toCharArray();
		char[] s222 = s22.toCharArray();
		if (s11.length() != s22.length()) {
			System.out.println("Not An Angram");
		} else {

			Arrays.sort(s111);
			Arrays.sort(s222);
			if (Arrays.equals(s111, s222)) {
				System.out.println("An Angram String");
			} else {
				System.out.println("Not An Angram String");
			}
		}
	}
}
