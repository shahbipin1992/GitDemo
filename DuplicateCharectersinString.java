package StringProgram;

public class DuplicateCharectersinString {

	public static void main(String[] args) {
int count;
		String a ="Beautiful sea nnnb";
		String b=a.toLowerCase();
		char[] c=b.toCharArray();
		
		
		for(int i=0;i<a.length();i++) {
			count=1;
		
		for(int j=i+1;j<a.length();j++) {
			if(c[i]==c[j] && c[i]!=' ') {
				count++;
				c[j]=0;   //Set string[j] to 0 to avoid printing visited character  
			}}
	if(count>1 && c[i]!=0) {
		System.out.print(c[i]+ ""+count);
	}

}}}
