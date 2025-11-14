package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateAndReverse {

	public static void main(String[] args) {
		String s = "Azmat Azmat Ali";
		String sp[] = s.split(" ");
		String dp = "";
		String rev = "";
		HashMap<String, Integer> map = new LinkedHashMap();
		for (String w : sp) {
			if (map.containsKey(w)) {
				map.put(w, map.get(w) + 1);
			} else {
				map.put(w, 1);
			}
		}
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			if (en.getValue() > 1) {
				System.out.println(en.getKey());
				dp = en.getKey();
			}
		}
		for (int i = dp.length() - 1; i >= 0; i--) {
			rev = rev + dp.charAt(i);
		}
		System.out.println(rev);
	}

}
