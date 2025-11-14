package StringProgram;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachCharacterinWord {

	public static void main(String[] args) {
		String s="Azmat Ali";
		String rev="";
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++) {
			String w=sp[i];
			String r="";
			for(int j=w.length()-1;j>=0;j--) {
				r=r+w.charAt(j);
			}
			rev=rev+r+" ";
		}
		System.out.println(rev);
	}
	}
