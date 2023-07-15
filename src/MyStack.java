import java.util.Stack;

public class MyStack {

    public static void main(String argsp[]){

        Stack<String> stack1 = new Stack<>();
        stack1.push("pranay");
        stack1.push("kumar");
        stack1.push("reddy");
        stack1.push("mettu");
//        System.out.println(stack1);
//        stack1.pop();
//        System.out.println(stack1);
        while(!stack1.isEmpty()){
            System.out.println(stack1.peek());
            stack1.pop();
        }

    }
}

