package generics;
public class GenericBox<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("Hello");
        System.out.println("String: " + stringBox.getItem());
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(100);
        System.out.println("Integer: " + intBox.getItem());
        
        GenericBox<Double> dBox=new GenericBox<>();
        dBox.setItem(98.78);
        System.out.println(dBox.getItem());
    }
}

