package StringProgram;

public class VowelandConsnantinString {

	public static void main(String[] args) {
		String a = "Beautiful Sea";
		int vcount = 0;
		int ccount = 0;
		String b = a.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
					|| b.charAt(i) == 'u') {
				vcount++;
			} else if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z') {
				ccount++;
			}
		}
		System.out.println("Total number of Vowels are " + vcount);
		System.out.println("Total number of Consnent are " + ccount);
	}

}
