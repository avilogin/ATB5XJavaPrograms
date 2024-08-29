package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class retrieveElementOfIndex {
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

        System.out.println( "For index 2 -> "+l.get(2));







    }
}
