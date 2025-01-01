package com.ust.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String>  map=new HashMap<>();
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "oracle");
		Set keys=map.keySet();
		System.out.println(keys);
		Collection values=map.values();
		System.out.println(values);
		Set entries=map.entrySet();
		System.out.println(entries);
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		}
}
