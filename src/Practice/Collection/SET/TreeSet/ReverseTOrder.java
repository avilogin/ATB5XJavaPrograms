package src.Practice.Collection.SET.TreeSet;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTOrder {
    public static void main(String[] args) {
        System.out.println("------String----");
        TreeSet l = new TreeSet();
        l.add("Bana");
        l.add("Cana");
        l.add("Zana");
        l.add("Fana");
        l.add("Yana");


        System.out.println(l);
        Iterator i = l.descendingIterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("------Numbers----");
        TreeSet t  = new TreeSet();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println(t);
        Iterator it = t.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
