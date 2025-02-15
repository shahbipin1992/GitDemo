package StringProgram;

public class SpecialChracterRemoveinString {

	public static void main(String[] args) {
		String a = "A@##$$z&**&^mat}{)";

		System.out.println(a.replaceAll(("[^a-zA-Z0-9]"), ""));

	}

}
