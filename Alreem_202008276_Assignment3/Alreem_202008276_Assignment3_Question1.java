package Main;

import java.util.Scanner;
public class Alreem_202008276_Assignment3_Question1 {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue ();
        for(int i = 0 ; i < 20 ; i++)
            queue.enqueue ( i );
        System.out.println("Please enter the key : ");
        System.out.println("No of elements greater than the key are : " + count(queue, new Scanner(System.in).nextInt()));
    }

    public static int count(LinkedQueue queue, int key) {
        int count = 0;
        QueueNode first = queue.front;
        while ( first!=null ){
            if(first.getInfo () > key)
                count++;
            first = first.link;
        }
        return count;
    }
}