package NumberProgram;

public class SwapTwoNumbersWithoutusingTemp {

	public static void main(String[] args) {
		int a = 98;
		int b = 66;
		System.out.println("Value of A Before swapping " + a);
		System.out.println("Value of B Before swapping " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Value of A Before swapping " + a);
		System.out.println("Value of B Before swapping " + b);
	}

}
