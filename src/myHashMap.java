import java.util.HashMap;
import java.util.Map;

public class myHashMap {
    public static void main(String args[]){

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Pranay");
        map.put(2,"Kumar");
        map.put(3,"Reddy");
        System.out.println(map.get(3));
        map.put(2,"Mettu");
//        map.remove(3);
        map.put(null, "Hello");
//        System.out.println(map.get(null));// HashMaps can deal with "null" values also
        for (Integer key:map.keySet()
             ) {
            System.out.println(map.get(key));

        }
    }
}
