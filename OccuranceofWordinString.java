package StringProgram;

public class OccuranceofWordinString {

	public static void main(String[] args) {
		String s = "Azmat Ali Azmat Azmat ";
		int count = 0;
		String word = "Azmat";
		String sp[] = s.split(" ");
		for (int i = 0; i < sp.length; i++) {

			if (sp[i].equals(word)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
