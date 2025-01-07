package com.ust.collections.map;

public class Course {
	
	Integer id;
	String cname;
	public Course(Integer id, String cname) {

		this.id = id;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + "]";
	}
	
	

}
