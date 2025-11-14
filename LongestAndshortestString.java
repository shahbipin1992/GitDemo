package StringProgram;

public class LongestAndshortestString {

	public static void main(String[] args) {
		//String s="Hi Azmat Ali";
		String s= "Java is Best Prograimming";
		String sp[]=s.split(" ");
	String lg="";
	int l=0;
	String sm=sp[0];
	
	for(int i=0;i<sp.length;i++)
	
	{
		if(sp[i].length()>l) {
			lg=sp[i];
			l=sp[i].length();
		}
	}
	System.out.println(lg);
	for(int i=0;i<sp.length;i++) {
		if(sp[i].length()<sm.length()) {
			sm=sp[i];		
		}	
	}
	System.out.println(sm);
	}
}
