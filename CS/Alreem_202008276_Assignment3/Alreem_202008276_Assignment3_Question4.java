package Main;

import java.util.*;

public class Alreem_202008276_Assignment3_Question4 {
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
        System.out.println ( "Enter the index to remove : " );
        try {
            queue = remove ( queue , new Scanner ( System.in ).nextInt ( ) );
            front = queue.front;
            while ( front!=null ){
                System.out.print ( front.getInfo () + " " );
                front = front.link;
            }
        }catch ( QueueUnderFlowException e ){
            e.printStackTrace ();
        }
    }

    public static LinkedQueue remove(LinkedQueue queue,int index) throws QueueUnderFlowException {
        if(index>=queue.count)
            return queue;
        int count = 0;
        QueueNode front = queue.front;
        LinkedQueue tempQueue = new LinkedQueue ();
        while ( front != null ) {
            if(count!=index)
                tempQueue.enqueue ( queue.front() );
            queue.dequeue ();
            count++;
            front = front.link;
        }
        return tempQueue;
    }

}

