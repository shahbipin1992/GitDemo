package ArrayProgram;

public class LeastNumberinArray {

	public static void main(String[] args) {
		int a[] = { -8, 87, 6, 7 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}
		}
		System.out.println(min);
	}

}
