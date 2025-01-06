package generics;


public class GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};
        printArray(intArray);
        printArray(strArray);
        
        Long[] longarray= {34l,456l,567l,4565l,565l};
        printArray(longarray);
        Character[] chararray= {'$','&','*','@'};
        printArray(chararray);
    }
}

