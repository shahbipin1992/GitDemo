package StringProgram;

public class ReverseASpecificWord {

	public static void main(String[] args) {
		  String str = "Join your Teams meeting";
	        //Join your smaeT meeting
		  String t="Teams";
		  String r="";
		  for(int i=t.length()-1;i>=0;i--) {
			 r=r+t.charAt(i);
		  }
		  String res=str.replace(t,r);
		  System.out.println(res);
	}

}
