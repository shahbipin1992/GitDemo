package StringProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToList {

	public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap();
	map.put("Azmat", 1);
	map.put("Ali", 2);
	map.put("Mohd", 3);
	

	
	
	List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
	System.out.println("List is "+ list);
	System.out.println(map);
	
	List<Integer> st=new ArrayList(map.keySet());
	System.out.println(st);
	
	List<String>num=new ArrayList(map.values());
	System.out.println(num);
	
	}}