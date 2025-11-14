package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice2 {

	public static void main(String[] args) {
		//This is a test This test is simple test
	     String s="Azmat Azmat Azmat Ali Ali Selenium";
	    		 //"This is a test This test is simple test";
	     String sp[]=s.split(" ");
	     String wrd="";
	     int max=0;
	     HashMap<String,Integer> map=new LinkedHashMap();
	     for(String w:sp){
	         if(map.containsKey(w)){
	             map.put(w,map.get(w)+1);
	         }else{
	              map.put(w,1);
	         }
	     }
	     for(Map.Entry<String,Integer> en:map.entrySet()){
	         if(en.getValue()>1){
	           //  System.out.println(en.getKey()+" ");
	             if(max<en.getValue()){
	                 wrd=en.getKey();
	             }
	         }
	     }
	       System.out.print("Max "+ wrd);

	    }
	}