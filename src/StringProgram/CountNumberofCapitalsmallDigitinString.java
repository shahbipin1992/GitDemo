package StringProgram;

public class CountNumberofCapitalsmallDigitinString {

	public static void main(String[] args) {
		String s = "AzMaT124@li";

		char c[] = s.toCharArray();
		int capital = (int) s.chars().filter(Character::isUpperCase).count();
		int small = (int) s.chars().filter(Character::isLowerCase).count();
		int Digit = (int) s.chars().filter(Character::isDigit).count();
		int spcl = s.length() - (capital + small + Digit);

		System.out.println(capital);
		System.out.println(small);
		System.out.println(Digit);
		System.out.println(spcl);
	}

}
