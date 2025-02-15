package NumberProgram;

public class GCDofNumber {

	public static void main(String[] args) {
		int a = 48;
		int b = 60;
		int temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}

}
