package generics;
class Box<T> {
	T x;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
}
public class GenericsDemo {

	   public static < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	public static void main(String[] args) {
		Integer a[]= {3,4,2,5,6,7,8};
		printArray(a);
		String s[]= {"ram","raj","kiran","ramesh"};
		printArray(s);
		Float f[]= {4.3f,6.7f,8.9f,5.6f};
		printArray(f);
		Box<Integer> bi=new Box<>();
		bi.setX(50);
		System.out.println(bi.getX());
		Box<String> bs=new Box<>();
		bs.setX("Java/J2EE");
		System.out.println(bs.getX());
		Box<Double> bd=new Box<>();
		bd.setX(987.90);
		System.out.println(bd.getX());
	}
}
