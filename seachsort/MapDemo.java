package com.ust.collections.seachsort;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "oracle");
		map.put(8, "react");
		map.put(3,"java");
		map.put(2, "python");
		map.put(null, "angular");
		map.put(null, "spring");
		map.put(10, null);
		map.put(11, null);
		map.put(null, null);
		System.out.println(map);

	}

}
