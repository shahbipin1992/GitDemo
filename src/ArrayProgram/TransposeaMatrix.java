package ArrayProgram;

public class TransposeaMatrix {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 8, 7, 6 }, { 2, 4, 9 } };
		int b[][] = new int[3][3];

		System.out.println("The Matrix is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
		System.out.println("Transpose of Matrix is:");
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++)

			{
				b[j][i]=a[i][j];
					System.out.print(b[j][i]);
					System.out.print("\t");
				}
			System.out.println(" ");
			}
			
		}

	}


