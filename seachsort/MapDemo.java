package com.ust.collections.seachsort;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(1, "oracle");
		map.put(8, "react");
		map.put(3,"java");
		map.put(2, "python");
		map.put(0, "angular");
		System.out.println(map);

	}

}
