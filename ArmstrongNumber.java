package NumberProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int rem;
		double sum = 0;
		int temp = num;
		while (num != 0) {
			rem = num % 10;
			sum = sum + Math.pow(rem, 3);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("An Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");

		}
	}

}
