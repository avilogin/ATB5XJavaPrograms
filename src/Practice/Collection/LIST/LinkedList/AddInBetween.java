package src.Practice.Collection.LIST.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddInBetween {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList();
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");

        Iterator i = s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("------------");
        LinkedList<String> l = new LinkedList<>();
        l.offer("Bima");
        l.offer("Dima");

        s.addAll(1,l);
        Iterator ii = s.iterator();
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }





    }
}
