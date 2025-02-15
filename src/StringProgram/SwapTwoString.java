package StringProgram;

public class SwapTwoString {

	public static void main(String[] args) {
		String a = "Hi Azmat";
		String b = "Hello";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

}
