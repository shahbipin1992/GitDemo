package StringProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class dd {

	public static void main(String[] args) {
	
 int vcount=0;
 int ccount=0;
 String s="aartYnnnnvvg";
 
 for(int i=0;i<s.length();i++) {
	 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
		 vcount++;
	 }
	 else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
		 ccount++;
	 }
	
 }
 System.out.println(ccount);
 System.out.println(vcount);
 
	}
	
	}