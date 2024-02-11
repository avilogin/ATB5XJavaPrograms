package src.Oops013_21Jan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab202 {
    public static void main(String[] args) {

        List li = new ArrayList<>();
        li.add("Avijeet");
        li.add("Lirics");
        li.add("Bunty");
        li.add("Sourav");
        li.add("Sunil");
        li.add("Avijeet");
        System.out.println(li);
        System.out.println("-----------");

        //this will traverse the list from left to right
        ListIterator lt = li.listIterator();
        while (lt.hasNext())
        {
            //lt.add("Deba"); Modification are allowed in case of listIterator
            System.out.println(lt.next());
        }

        System.out.println("--------------------");

        //This will traverse the list from right to left
        ListIterator lt2 = li.listIterator(li.size());
        while (lt2.hasPrevious())
        {
            System.out.println(lt2.previous());
        }

        /////////21:49
    }
}
