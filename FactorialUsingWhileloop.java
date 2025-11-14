package NumberProgram;

public class FactorialUsingWhileloop {

	public static void main(String[] args) {
		int fact = 1;
		int num = 5;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);

	}

}
