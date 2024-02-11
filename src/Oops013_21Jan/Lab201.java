package src.Oops013_21Jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab201 {

    public static void main(String[] args) {
        List li = new ArrayList<>();//we can specify the type of data it can hold by using (List<String> li = new ArrayList<>());
        li.add("Avijeet");
        li.add("Lirics");
        li.add("Bunty");
        li.add("Sourav");
        li.add("Sunil");
        li.add("Avijeet");
        System.out.println(li);
        System.out.println("-----------");

        for (Object oo :li)
        {
            //li.add("Deba"); this is not allowed while any loop is in progress
            System.out.println(oo);
        }
        System.out.println("-------");

        List numLi = new ArrayList<>();
        numLi.add(11);
        numLi.add(22);
        numLi.add(33);
        numLi.add(44);
        numLi.add(55);
        System.out.println(numLi);
        System.out.println("-------------");

        for (int i =0; i<numLi.size();i++)
        {
            System.out.println(numLi.get(i));
        }

        System.out.println("--------");

        li.addAll(numLi);
        System.out.println(li);
        System.out.println("-------------");

        Iterator it = li.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //it is not allowed to add more items in the list while iterator is working.


    }
}
