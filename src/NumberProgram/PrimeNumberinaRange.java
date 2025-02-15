package NumberProgram;

public class PrimeNumberinaRange {

	public static void main(String[] args) {
		int lower = 1, upper = 25;

		for (int i = lower; i <= upper; i++)
			if (isPrime(i))
				System.out.print(i + " ");
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;

			}
		}
		return true;

	}
}
