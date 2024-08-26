package src.Practice.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arrayList01 {
    public static void main(String[] args) {
        List li = new ArrayList<>();
        li.add("Avijeet");
        li.add(12345);
        li.add(22.56);
        li.add(true);
        li.add("c");
        li.add(234.657845656);
        System.out.println(li);//print in a list

        //using Iterator
        Iterator it = li.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("-----------------------");
        List my = List.of("asdsgadf",22,22.567,true,"C",234.567890966);

        for(Object lit :my)
        {
            System.out.println(lit);
        }
        System.out.println("----------Linked List---------");

        List link = new LinkedList();
        link.add("Avijeet");
        link.add(12345);
        link.add(22.56);
        link.add(true);
        link.add("c");
        link.add(234.657845656);
        link.get(3);


        Iterator er = link.iterator();
        while(er.hasNext())
        {
            System.out.println(er.next());
        }
        System.out.println("----------Updating Linked List---------");

        link.remove(1);
        System.out.println(link.get(2));




    }
}
