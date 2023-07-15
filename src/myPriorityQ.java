import java.util.PriorityQueue;

public class myPriorityQ {
    public static void main(String args[]){

        PriorityQueue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("Pranay",23));
        queue.add(new Person("Karthik",21));
        queue.add(new Person("MNR",52));
        queue.add(new Person("Bharathi",40));

        while(queue.peek()!= null){
            System.out.println(queue.poll());// sorted acc to age as said in the comparator
        }


    }
}
