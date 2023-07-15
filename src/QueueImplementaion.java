import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementaion {
    public static void main(String args[]){
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("pranay"); // use offer for not throwing excepeion instead of add() method
        myQueue.add("kumar");
        myQueue.add("reddy");
        myQueue.add("mettu");

       while(!myQueue.isEmpty()){
           System.out.println(myQueue.peek());
           myQueue.remove();
       }

    }
}
