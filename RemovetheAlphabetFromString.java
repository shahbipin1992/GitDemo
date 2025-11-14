package StringProgram;

public class RemovetheAlphabetFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123Ali";
		String r = "";
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(c[i])) {
				r = r + c[i];
			}
		}
		System.out.println(r);
	}

}
