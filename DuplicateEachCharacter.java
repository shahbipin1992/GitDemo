package StringProgram;

public class DuplicateEachCharacter {

	public static void main(String[] args) {
		String s = "Azmat";
		StringBuilder sb = new StringBuilder();
		char c[] = s.toCharArray();
		for (char ch : c) {
			sb.append(ch).append(ch);
		}
		System.out.println(sb);
	}

}
