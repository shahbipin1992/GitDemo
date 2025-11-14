package ArrayProgram;

public class MergingTwoArray {

	public static void main(String[] args) {
		int a[] = { 3, 2, 7 };
		int b[] = { 1, 5, 8 };
		int t[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			t[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			t[a.length + i] = b[i];
		}
		for (int i = 0; i < t.length; i++)
			System.out.print(t[i] + " ");

	}

}
