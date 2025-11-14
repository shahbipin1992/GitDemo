package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String s="Aazm@t @lii";
		String ss=s.toLowerCase();
		char c[]=ss.toCharArray();
		Set<Character> set=new LinkedHashSet();
		for(Character ch:c) {
			set.add(ch);
		}
	for(Character ch:set) {
		System.out.print(ch);
	}

	}

}
