package ArrayProgram;

public class SumofNumbersinString {

	public static void main(String[] args) {
		String s="Az12345mat6";
		char []c=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(c[i])) {
				sum=sum+c[i]-'0';
			}
		}
		System.out.println(sum);

	}

}
