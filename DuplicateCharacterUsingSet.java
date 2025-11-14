package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacterUsingSet {

	public static void main(String[] args) {
		String s="Azmat Alii";
		char c[]=s.toCharArray();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			if(set.add(c[i])==false) {
				System.out.println("Duplicate Charcaters are :"+ c[i]);
			}
		}

	}

}
