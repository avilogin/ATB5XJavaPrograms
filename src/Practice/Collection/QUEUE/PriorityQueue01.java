package src.Practice.Collection.QUEUE;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(20);
        pq.offer(2344);
        pq.offer(2256);
        pq.offer(12314);
        System.out.println(pq);

        pq.add(11);//add elements in queue
        System.out.println(pq);
        pq.remove(2344);//remove specific element from queue
        System.out.println(pq);
        pq.poll();//remove first element from the queue
        System.out.println(pq);
        System.out.println(pq.peek());//gives the first element in queue




        Iterator it = pq.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
