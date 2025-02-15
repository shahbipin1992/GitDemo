package ArrayProgram;

public class SumofArraynumbers {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 8, -10 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
