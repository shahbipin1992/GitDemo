package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordCountUsingSet {

	public static void main(String[] args) {
		String w="Python Java Java Selenium Selenium";
		String s[]=w.split(" ");
		Set<String> set=new LinkedHashSet();
		for(int i=0;i<s.length;i++) {
			if(!set.contains(s[i])) {
				set.add(s[i]);
			}
			else {
				System.out.println(s[i]);
			}
		}
		

	}

}
