package StringProgram;

public class LongestString {

	public static void main(String[] args) {
	String s[]= {"Azmat","Ali","Simalmani"};
	
	System.out.println(LongStr(s));
		
	}
	
	public static String LongStr(String [] a) {
		int index=0;
		
		int le=a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>le) {
				le=a[i].length();
				index=i;
			}
		}
		return a[index];
	}

}
