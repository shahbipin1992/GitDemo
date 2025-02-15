package StringProgram;

public class OccuranceofCharaterinString {

	public static void main(String[] args) {
		String a="azmat ali";
		char ch='a';
		int count=0;
		for(char c:a.toCharArray()) {
			if(c==ch) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
