package ArrayProgram;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfelementUsingHashMap {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6};
		Map<Integer,Integer> map=new HashMap();
		for(int num:a) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer> en:map.entrySet()) {
			if(en.getValue()>=1) {
				System.out.println("Frequency of Element is "+ en.getKey()+ " is "+ en.getValue());
			}
		}

	}

}
