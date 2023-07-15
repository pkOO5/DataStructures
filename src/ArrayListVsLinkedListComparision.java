import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListComparision {

    public static void main(String args[]){

        List<Integer> array = new ArrayList<Integer>();
        long now = System.currentTimeMillis();
        System.out.println("Now+ " +now );
        for(int i=0;i<500000;i++){
           // array.add(i);
            array.add(i);
        }
        System.out.println("Time taken+ " + (System.currentTimeMillis()-now));
        LinkedList<Integer> linkedList = new LinkedList<>();
        long nowlink = System.currentTimeMillis();
        System.out.println("Now for LinkedList+ " + nowlink);
        for(int i=0;i<500000;i++){
            //linkedList.add(i);
            linkedList.addFirst(i);
        }
        System.out.println("After  for LinkedList+ " + (System.currentTimeMillis()-nowlink));
    }
}
