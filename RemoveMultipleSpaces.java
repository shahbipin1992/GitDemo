package StringProgram;

public class RemoveMultipleSpaces {

	public static void main(String[] args) {
		String s="Azmat               Ali                  Java  ";
		System.out.println(s.trim().replaceAll("\\s+", " "));
	}

}
