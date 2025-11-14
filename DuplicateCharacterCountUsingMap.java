package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacterCountUsingMap {

	public static void main(String[] args) {
		String s="AAzmmmaatttt";
		char c[]=s.toCharArray();
		HashMap<Character,Integer> map=new LinkedHashMap();
		for(Character ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey() + ""+entry.getValue());
			}
		}

	}

}

