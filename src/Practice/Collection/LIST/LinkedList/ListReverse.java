package src.Practice.Collection.LIST.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        Iterator it = l.descendingIterator();//print in descending order
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("-----For String----------");
        LinkedList<String> s = new LinkedList();
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");
        s.add("Bima");
        s.add("Pima");
        s.add("Kima");

        Iterator i = s.descendingIterator();//print in descending order
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("-----Inserting element----------");
        s.set(1,"Bima");
        Iterator ii = s.descendingIterator();//print in descending order
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }
    }
}
