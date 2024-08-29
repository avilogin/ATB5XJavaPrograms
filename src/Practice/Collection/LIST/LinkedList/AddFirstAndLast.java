package src.Practice.Collection.LIST.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddFirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList();
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");
        s.add("Bima");
        s.add("Pima");
        s.add("Kima");

        Iterator i = s.iterator();//print in descending order
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        s.addFirst("First");
        s.addLast("Last");
        System.out.println("------------");
        Iterator ii = s.iterator();//print in descending order
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }

    }
}
