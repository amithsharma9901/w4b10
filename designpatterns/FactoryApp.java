package com.training.designpatterns;
//Abstract Product Class
abstract class Product {
 public abstract void display();
}

//Concrete Products
class TV extends Product {
 @Override
 public void display() {
     System.out.println("This is TV");
 }
}

class Laptop extends Product {
 @Override
 public void display() {
     System.out.println("This is laptop");
 }
}

//Creator Abstract Class
abstract class Creator {
 public abstract Product factoryMethod();
}

//Concrete Creators
class TVProducer extends Creator {
 @Override
 public Product factoryMethod() {
     return new TV();
 }
}

class LaptopProducer extends Creator {
 @Override
 public Product factoryMethod() {
     return new Laptop();
 }
}

//Client Code
public class FactoryApp {
 public static void main(String[] args) {
     Creator TV1 = new TVProducer();
     Product productA = TV1.factoryMethod();
     productA.display();

     Creator Laptop1 = new LaptopProducer();
     Product productB = Laptop1.factoryMethod();
     productB.display();
 }
}