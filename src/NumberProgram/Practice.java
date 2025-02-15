package NumberProgram;

import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {

		int count;
		String a = "Java java python sell";

		char[] s = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			count = 1;
			for (int j = i + 1; j < a.length(); j++) {

				if (s[i] == s[j] && s[i] != ' ') {

					count++;
					s[j] = 0;
				}
			}
			if (count > 1 && s[i] != 0) {
				System.out.println(s[i] + " " + count);
			}
		}

	}
}
