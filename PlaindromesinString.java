package StringProgram;

public class PlaindromesinString {

	public static void main(String[] args) {
		String s="Radar Racer Java";
		String ss=s.toLowerCase();
		String sp[]=ss.split(" ");
	for(String w:sp) {
		if(w.charAt(0)==w.charAt(w.length()-1)) {
			System.out.println(w);
		}
	}	
		
		
	}

}

