package ArrayProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddTwoMaptoList {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("Azmat", 1);
		map.put("Ali",2);
		map.put("Ali", 3);
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs=(Map.Entry)it.next();
			System.out.println(pairs.getKey()+ "="+pairs.getValue());
		
			
		}
		System.out.println("****************************");
		Map<String, Integer> map2 = new HashMap();
		map2.put("Delhi", 3);

		map.putAll(map2);

		System.out.println(map);
		System.out.println("****************************");

		List<String> list = new ArrayList(map.keySet());
		System.out.println(list);
		System.out.println("****************************");
		for (String t : list) {
			System.out.println(t);
		}
	}
}
