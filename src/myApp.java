import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class myApp {

    public static void main(String args[]){

        // for ascending order remove the Comparator.reverseOrder
        TreeMap<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(8,"eight");
        map.put(5,"five");
        map.put(10,"ten");
        map.put(1,"one");
        System.out.println("Smallest key: " + map.lastKey());
        System.out.println("Largest key: "+ map.firstKey());
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
