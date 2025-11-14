package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AutomationTo22uimn2 {

	public static void main(String[] args) {
		String s="Automation";
		String ss=s.toLowerCase();
		char c[]=ss.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap();
		for(Character w:c) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}
			else {
				map.put(w, 1);
			}
		}
		for(Map.Entry<Character, Integer> en:map.entrySet()) {
			if(en.getValue()==1) {
				System.out.print(en.getKey());
			}else {
				System.out.print(en.getValue());
			}
		}

	}

}
