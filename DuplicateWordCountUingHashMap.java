package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCountUingHashMap {

	public static void main(String[] args) {
		String s = "Azmat Azmat Azmat Ali Ali Selenium";
		String sp[] = s.split(" ");
		Map<String, Integer> map = new HashMap();
		for (String word : sp) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}
			else {
				map.put(word,1);
			}
		}
		System.out.println("Word Counts are : "+ map);
		for(Map.Entry<String,Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+ " "+ entry.getValue());
			}
		}

	}

}
