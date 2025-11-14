package PatternPrograms;

public class Abc3 {

	public static void main(String[] args) {
		int row = 5;

		for (int i = 0; i <= row; i++) {
			char c = 'A';
			for (int j = 0; j <= i; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
