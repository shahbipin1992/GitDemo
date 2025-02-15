package StringProgram;

public class ReverseWithoutEffectSpecialCharacter {

	public static void main(String[] args) {
		String s="Az@@matt#Ali";
		char c[]=s.toCharArray();
		int j=s.length()-1;
		for(int i=0;i<j;) {
			if(!Character.isAlphabetic(c[i])) {
				i++;
			}
			else if(!Character.isAlphabetic(c[j])) {
				j--;
			}
			else {
				char t=c[i];
				c[i]=c[j];
				c[j]=t;
				i++;
				j--;
			}
		}
		System.out.println(c);
		

	}

}
