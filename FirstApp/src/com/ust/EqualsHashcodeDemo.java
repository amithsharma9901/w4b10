package com.ust;

class Course{
	Integer id;
	String cname;
	
	public Course(Integer id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	 public boolean equals(Object o) {
      Course c1=(Course) o;
      if ((this.id== c1.id) && (this.cname.equals(c1.cname))) 
    	  return true; 
      else return false; 
      }
	 
	 public int hashCode() {
		 return this.id.hashCode();
	 }
	 	
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + "]";
	}
	
	
}

public class EqualsHashcodeDemo {

	public static void main(String[] args) {
		
		String s1="java"; //scp,1
		String s2=new String("java"); //heap ,2,scp
		
		//equals()  -content
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);  //adress
		
		System.out.println(s1.hashCode()  +"  "+s2.hashCode());
		System.out.println(s2);
		//hashCode()
		
		Course c1=new Course(10,"j2ee");
		Course c2=new Course(10,"j2ee");
		System.out.println(c1==c2);  //address
		
		System.out.println(c1.equals(c2));  //content
		System.out.println(c1==c2);
		System.out.println(c1.hashCode()+"  "+c2.hashCode());

	}

}
