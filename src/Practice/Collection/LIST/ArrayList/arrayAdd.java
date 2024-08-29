package src.Practice.Collection.LIST.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class arrayAdd {
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
        l.add(2,"Pink");

        System.out.println("---------------");
        for (Object j : l)
        {
            System.out.println(j);
        }




    }
}
