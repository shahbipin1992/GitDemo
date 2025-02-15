package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s="Java Java Selenium Best";
		String sp[]=s.split(" ");
		Set<String> set=new LinkedHashSet();
		for(String st:sp) {
			set.add(st);
		}
		String f=String.join(" ", set);
		System.out.println(f);

	}

}
