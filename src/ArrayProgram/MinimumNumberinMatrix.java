package ArrayProgram;

public class MinimumNumberinMatrix {

	public static void main(String[] args) {
		int a[][] = { { 4, 7, 6 }, { 9, 8, -6}, { 4, 8, 2 } };
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
