package StringProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapList {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap();

		map.put("Azmat", 1);
		map.put("Ali", 2);
		map.put("Java", 3);

		Set s=map.entrySet();
		Iterator i=s.iterator();

		while(i.hasNext()) {
			Map.Entry<String, Integer> m=(Map.Entry<String, Integer>)i.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
