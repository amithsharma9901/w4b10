package generics;

public class UpperboudDemo {
	
	
	// ? extends Number  -> all sub classes of Number , Short,Byte,Long,Int,Float,Double
    public static <T extends Number> void printDouble(T number) {
        System.out.println(number.doubleValue());
    }

    public static void main(String[] args) {
        printDouble(10); // Integer
        printDouble(4.5f);
        printDouble(345l);
        printDouble(234234324);
      //  printDouble('a');
        //printDouble(true);
        // printDouble("Test"); // Compile-time error
    }
}
