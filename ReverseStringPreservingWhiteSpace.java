package StringProgram;

public class ReverseStringPreservingWhiteSpace {

	public static void main(String[] args) {
		String s = "I Love India";
		char c[] = s.toCharArray();
		char res[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (c[i] == ' ') {
				res[i] = ' ';
			}
		}

		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++)
			if (c[i] != ' ') {
				if (res[j] == ' ') {
					j--;
				}
				res[j] = c[i];
				j--;

			}
		System.out.println(res);
	}

}
