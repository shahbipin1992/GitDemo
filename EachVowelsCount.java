package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EachVowelsCount {

	public static void main(String[] args) {
		String s = "Hexaware";
		char c[] = s.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap();
		{
			for (Character ch : c) {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}

			}
			for (Map.Entry<Character, Integer> en : map.entrySet()) {
				if (en.getKey() == 'a' || en.getKey() == 'e' || en.getKey() == 'i' || en.getKey() == 'o'
						|| en.getKey() == 'u') {
					System.out.println(en.getKey() + "" + en.getValue());
				}
			}
		}
	}
}
