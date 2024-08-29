package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateElement {
    public static void main(String[] args) {
        List l =  new ArrayList();
        l.add("Black");
        l.add("White");
        l.add("blue");
        l.add("gray");
        l.add("green");


        Iterator e = l.iterator();
        while (e.hasNext())
        {
            System.out.println(e.next());
        }

        l.set(1,"Yellow");
        System.out.println("---------New List---------");
        Iterator p = l.iterator();
        while (p.hasNext())
        {
            System.out.println(p.next());
        }

        l.remove(3);
        System.out.println("---Removing third element--");
        Iterator q = l.iterator();
        while (q.hasNext())
        {
            System.out.println(q.next());
        }







    }
}
