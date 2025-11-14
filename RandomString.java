package StringProgram;

import java.util.UUID;

public class RandomString {

	public static void main(String[] args) {
		String s = UUID.randomUUID().toString();
		s.split("-");
		System.out.println(s.substring(0, 5));
	}

}
