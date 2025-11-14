package StringProgram;

public class CountNumberofCapitalsmallDigitinString {

	public static void main(String[] args) {
		String s = "AzMaT@li";

	
		int capital = (int) s.chars().filter(Character::isUpperCase).count();
		int small = (int) s.chars().filter(Character::isLowerCase).count();
		int Digit = (int) s.chars().filter(Character::isDigit).count();
		int spcl = s.length() - (capital + small + Digit);

		System.out.println("Captial Count is : "+capital);
		System.out.println("Small Count is : "+small);
		System.out.println("Digit Count is : "+Digit);
		System.out.println("Special Character Count is : "+spcl);
	}

}
