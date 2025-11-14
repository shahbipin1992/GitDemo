package StringProgram;

public class OccuranceofCharaterinString {

	public static void main(String[] args) {
		String a="azmat ali";
		char ch='a';
		int count=0;
		char chh[]=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(chh[i]==ch) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
