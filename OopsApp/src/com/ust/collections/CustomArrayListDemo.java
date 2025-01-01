package com.ust.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Product{
	Integer id;
	String name;
	Double price;
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class CustomArrayListDemo {
	public static  void addProduct(Product p) {
		productList.add(p);
	}
	public static void deleteProduct(Integer id1) {
		Iterator<Product> i=productList.iterator();
		while(i.hasNext()) {
		   Product p=(Product)i.next();
			if(p.id==id1)
				i.remove();
		}
	}
	public static void listProducts() {
		productList.forEach(p->System.out.println(p));
	}
	
	static List<Product> productList=new ArrayList<>();
	static {

		productList.add(new Product(101,"bag",890.90));
		productList.add(new Product(102,"box",1890.90));
		productList.add(new Product(103,"table",2890.90));
		productList.add(new Product(104,"box123",1890.90));
		productList.add(new Product(105,"table123",2890.90));
	}

	public static void main(String[] args) {
		System.out.println(" begining.............");
		listProducts();
		addProduct(new Product(106,"pen",999.90));
		System.out.println("after adding ............");
		
		listProducts();
		deleteProduct(103);
		System.out.println("after deleting.............");
		
		listProducts();
		
		
		
		
				

	}

}
