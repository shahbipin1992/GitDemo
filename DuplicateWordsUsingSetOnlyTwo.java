package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordsUsingSetOnlyTwo {

	public static void main(String[] args) {
		String s="Azmat Ali Azmat Ali Java";
		String sp[]=s.split(" ");
		Set<String> set=new LinkedHashSet();
		for(int i=0;i<sp.length;i++) {
			if(set.add(sp[i])==false) {
				System.out.println(sp[i]);
			}
		}

	}

}
