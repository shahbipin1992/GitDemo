package StringProgram;

public class RemoveSpaceinString {

	public static void main(String[] args) {
		
		String s = "Az ma  t";
		System.out.println(s.replaceAll("\\s+", ""));
	}

}
