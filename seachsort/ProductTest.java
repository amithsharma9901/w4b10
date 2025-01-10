package com.ust.collections.seachsort;

import java.util.Comparator;
import java.util.TreeSet;

class PriceComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Product s1=(Product)o1;
		Product s2=(Product)o2;
		if(s1.price>s2.price)
			return 1;
		else
			if(s1.price<s2.price)
				return -1;
			else
					return 0;
	}
	
}

class NameComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Product s1=(Product)o1;
		Product s2=(Product)o2;
		return s1.name.compareTo(s2.name);
	}
	
}

class IdComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Product s1=(Product)o1;
		Product s2=(Product)o2;
		if(s1.id>s2.id)
			return 1;
		else
			if(s1.id<s2.id)
				return -1;
			else
					return 0;
	}
	
}
public class ProductTest {

	public static void main(String[] args) {
		//
		TreeSet<Product> productSet=new TreeSet<>(new PriceComparator());
		productSet.add(new Product(90,"bag",879.90));
		productSet.add(new Product(60,"table",1879.90));
		productSet.add(new Product(30,"pin",89.90));
		productSet.add(new Product(70,"mobile",32879.90));
		for(Product p:productSet)
			System.out.println(p);
		
		System.out.println("====java8=======");
		System.out.println("===price====");
		Comparator<Product> priceComp=(p1,p2)->p1.price.intValue()-p2.price.intValue();
		productSet.stream().sorted(priceComp).forEach(p->System.out.println(p));
		System.out.println("===name=======");
		Comparator<Product> nameComp=(p1,p2)->p1.name.compareTo(p2.name);
		productSet.stream().sorted(nameComp).forEach(p->System.out.println(p));
		System.out.println("===id===");
		Comparator<Product> idComp=(p1,p2)->p1.id-p2.id;
		productSet.stream().sorted(idComp).forEach(p->System.out.println(p));
	
		
		// search for given product name in list of products ,display Product object with ( id,name,price) 
		
		

	}

}
