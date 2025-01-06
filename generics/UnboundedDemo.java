package generics;
import java.util.Arrays;
import java.util.List;
public class UnboundedDemo {
	
    public static void printList(List<?> list) { 
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

   public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");
        List<Float> flist=Arrays.asList(4.5f,6.7f,7.8f);
        List<Boolean> blist=Arrays.asList(true,false);
        printList(intList);
        printList(strList);
        printList(flist);
        printList(blist);
    }
}

