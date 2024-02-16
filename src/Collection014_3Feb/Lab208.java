package src.Collection014_3Feb;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab208 {
    public static void main(String[] args) {

        Queue q = new PriorityQueue();

        q.offer(10);
        q.offer(50);
        q.offer(10);
        q.offer(15);
        q.offer(30);
        q.offer(5);

        System.out.println(q);
        q.add(15);
        System.out.println(q);
        q.poll();// deletes an item(Its works on FIFO concept)
        System.out.println(q);
        System.out.println(q.peek());//to check the first object

    }
}
