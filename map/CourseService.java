package com.ust.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CourseService {
	
	Map<Integer,Course> cMap=new HashMap<>();
	Integer i=0;
	public void addCourse(Course course) {
	
		cMap.put(++i, course);
		
		
	}
	public void listCourses() {
		cMap.entrySet().stream()
        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}

}
