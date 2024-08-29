package src.Practice.Collection.LIST.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Link01 {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        Iterator it = l.listIterator(2);//reading from a specific index
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
