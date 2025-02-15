package ArrayProgram;

public class Startingfrom1 {

	public static void main(String[] args) {
		int a[] = { 1, 43, 56, 101, 111, 1011, 54, 666, 87 };
		for (int i = 0; i < a.length; i++) {
			if (String.valueOf(a[i]).startsWith("1")) {
				System.out.println(a[i]);
			}

		}
	}

}
