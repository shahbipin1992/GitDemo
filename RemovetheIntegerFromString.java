package StringProgram;

public class RemovetheIntegerFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Azmat123";
		char c[] = s.toCharArray();
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(c[i])) {
				r = r + c[i];

			}
		}
		System.out.println(r);
	}

}
