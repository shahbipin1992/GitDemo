package StringProgram;

public class LongestAndShortestStringdup {

	public static void main(String[] args) {
		String s= "Azmat java Ali";
		String sp[]=s.split(" ");
		int l=0;
		String lg="";
		String sm=sp[0];
		String LgRev="";
		String smRev="";
		for(int i=0;i<sp.length;i++) {
			if(sp[i].length()>l) {
				l=sp[i].length();
				lg=sp[i];
			}
		}
		System.out.println("Longest String is : "+lg);
		for(int i=lg.length()-1;i>=0;i--) {
			LgRev=LgRev+lg.charAt(i);
		}System.out.println("Reverse of Longest String is :"+ LgRev);
	
	for(int i=0;i<sp.length;i++) {
		if(sp[i].length()<sm.length()) {
			l=sp[i].length();
			sm=sp[i];
		}
	}
	for(int i=sm.length()-1;i>=0;i--) {
		smRev=smRev+sm.charAt(i);
	}
	
	System.out.println("Smallest String is :"+sm);
	System.out.println("Reverse of Smallest String is :"+ smRev);
	
	
	}
}