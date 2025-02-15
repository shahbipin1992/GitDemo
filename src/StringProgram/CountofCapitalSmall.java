package StringProgram;

public class CountofCapitalSmall {

	public static void main(String[] args) {
		String s="Azm@t143M";
		char c[]=s.toCharArray();
		int cp=0;
		int sm=0;
		int sp=0;
		int d=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(c[i])) {
				cp++;
			}
			else if(Character.isLowerCase(c[i])) {
				sm++;
			}
			else if(Character.isDigit(c[i])) {
				d++;
			}
			else {
				sp++;
			}
		}
		System.out.println(cp);
		System.out.println(sm);
		System.out.println(d);
		System.out.println(sp);

	}

}
