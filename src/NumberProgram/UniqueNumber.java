package NumberProgram;

public class UniqueNumber {

	public static void main(String[] args) {
		int a[] = { 3, 3, 4, 4, 9 };
		int uni = a[0];
		for (int i = 1; i < a.length; i++) {

			uni = uni ^ a[i];
		}
		System.out.println(uni);
	}

}



