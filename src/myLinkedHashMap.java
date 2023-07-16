import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class myLinkedHashMap {

    public static void main(String args[]){

        // To preserve the order of insertion, we are using the LinkedHashMap
        // It uses doubly linked list behind the scenes, hece more memory
        Map<String,Integer> stringIntegerMap = new LinkedHashMap<>();
        stringIntegerMap.put("aaa",1);
        stringIntegerMap.put("bbb",1);
        stringIntegerMap.put("ccc",1);
        stringIntegerMap.put("ddd",1);
        stringIntegerMap.put("eee",1);
        stringIntegerMap.put("fff",1);
        for(String key1:stringIntegerMap.keySet()){
            System.out.println(key1);
        }

    }
}
