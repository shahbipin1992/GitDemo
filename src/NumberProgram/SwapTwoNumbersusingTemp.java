package NumberProgram;

public class SwapTwoNumbersusingTemp {

	public static void main(String[] args) {
		int a = 26;
		int b = 76;
		int temp;

		System.out.println("Value of A Before swapping " + a);
		System.out.println("Value of B Before swapping " + b);
		
		temp = a;
		a = b;
		b = temp;

		System.out.println("Value of A after swapping " + a);
		System.out.println("Value of B after swapping " + b);
	}

}
