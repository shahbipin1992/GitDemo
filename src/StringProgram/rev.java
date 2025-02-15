package StringProgram;

public class rev {

	public static void main(String[] args) {
		String s="abcd";
		char c[]=s.toCharArray();
		int j=s.length()-1;
		for(int i=0;i<j;) {
			char t=c[i];
			c[i]=c[j];
			c[j]=t;
		i++;
		j--;
		}
		System.out.println(c);

	}

}
