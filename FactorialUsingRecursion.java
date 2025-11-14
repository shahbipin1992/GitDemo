package NumberProgram;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(fact(num));
	}

	public static long fact(int num) {
		if (num >= 1)
			return num * fact(num - 1);
		else
			return 1;

	}

}
