package StringProgram;

public class ChangetoUppercaseAlternateCharacter {

	public static void main(String[] args) {
		String s="azmat";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		System.out.print(c);

	}

}
