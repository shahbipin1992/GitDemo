package ArrayProgram;

import java.util.HashMap;
import java.util.Map;

public class HashpMapNonDuplicateNumberin {

	public static void main(String[] args) {
		int a[]= {2,2,2,4,4,1,6,9,9,9};
		HashMap<Integer,Integer> map=new HashMap();
		for(int num:a) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> en:map.entrySet()) {
			if(en.getValue()==1) {
				System.out.println(en.getKey()+" ");
			}
		}
		
	}

}
