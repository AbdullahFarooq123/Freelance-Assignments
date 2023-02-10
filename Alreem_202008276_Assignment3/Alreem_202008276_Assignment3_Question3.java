package Main;

import java.util.Stack;

public class Alreem_202008276_Assignment3_Question3 {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue ();
        for(int i = 0 ; i < 20 ; i++)
            queue.enqueue ( i );
        QueueNode front = queue.front;
        while ( front!=null ){
            System.out.print ( front.getInfo () + " " );
            front = front.link;
        }
        System.out.println ( );
        try {
            reverse ( queue );
            front = queue.front;
            while ( front!=null ){
                System.out.print ( front.getInfo () + " " );
                front = front.link;
            }
        } catch ( QueueUnderFlowException e ) {
            e.printStackTrace ( );
        }
    }

    public static void reverse(LinkedQueue queue) throws QueueUnderFlowException {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmptyQueue ()) {
            stack.push ( queue.front() );
            queue.dequeue ();
        }
        while (!stack.isEmpty())
            queue.enqueue (stack.pop());
    }

}

