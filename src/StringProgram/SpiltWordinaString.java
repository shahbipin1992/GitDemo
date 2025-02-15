package StringProgram;

public class SpiltWordinaString {

	public static void main(String[] args) {
		String s = "Automation Java";
		String[] b = s.split(" ");
		for (String st : b) {
			System.out.println(st);
		}
	}

}
