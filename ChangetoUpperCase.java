package StringProgram;

public class ChangetoUpperCase {

	public static void main(String[] args) {
		String s="I love my india";
		char c[]=s.toCharArray();
		char ch='d';
		for(int i=0;i<s.length();i++) {
			if(c[i]==ch) {
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		System.out.println(c);

	}

}
