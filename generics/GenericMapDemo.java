package generics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class GenericMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
      //  Map map=new HashMap();
        map.put(1, "One");
        map.put(2, "Two");
        Set keys=map.keySet();
        
        for(Object k:keys)
        	System.out.println((Integer)k);
        Collection vals=map.values();
        for(Object o:vals)
        	System.out.println(o);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
