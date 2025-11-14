package StringProgram;

public class ReverseStringUsingFunctionall {

	public static void main(String[] args) {

		System.out.println(revSt("azmat"));

	}

	public static String revSt(String s) {
		
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		return rev;
	}

}
