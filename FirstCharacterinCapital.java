package StringProgram;

public class FirstCharacterinCapital {

	public static void main(String[] args) {
		String s = "hi azmat ali";
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			c[0] = Character.toUpperCase(c[0]);
			if (c[i] == ' ') {
				c[i + 1] = Character.toUpperCase(c[i + 1]);
			}
		}
		System.out.println(c);

	}

}
