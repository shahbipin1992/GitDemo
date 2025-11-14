package StringProgram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import javax.xml.transform.sax.SAXSource;

public class Practice {
	public static void main(String[] args) {
String s="automation automation is best best";
String sp[]=s.split(" ");
HashMap<String,Integer> map=new LinkedHashMap();
for(String ch:sp) {
	if(map.containsKey(ch)) {
		map.put(ch, map.get(ch)+1);	
}
else {
	map.put(ch,1);
}}
for(Map.Entry<String, Integer>en:map.entrySet()) {
	if(en.getValue()>1) {
		System.out.print(en.getKey()+" "+en.getValue());
	} 
}
	}}
	
