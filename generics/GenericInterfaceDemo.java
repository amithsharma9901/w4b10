package generics;


interface generic<T>{
	
	void show(T item);
}

class GenericImpl<T> implements generic<T> {
	@Override
	public void show(T item) {
		System.out.println("Value:"+item);
		
	}
}
public class GenericInterfaceDemo {

	public static void main(String[] args) {
		
		generic<Integer> e=new GenericImpl<>();
		e.show(98);
		generic<String> s=new GenericImpl<>();
		s.show("Java");
		
	}
}
