package StringProgram;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {

		//String s = "azmtaz";
		System.out.println(non("azmtazmat"));
	}

	public static char non(String s) {
		char c[]=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			boolean match = false;
			for (int j = 0; j < s.length(); j++) // Check if the character repeats in the rest of the string
			{

				if (i != j && c[i] == c[j]) {
					match = true;
					break;
				}
			}
			if (match == false) // If character does not repeat, return it
			{
				return s.charAt(i);//c[i];
			}

		}
		return '$';//if each repeat

	}
}