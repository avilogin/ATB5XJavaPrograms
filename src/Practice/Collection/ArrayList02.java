package src.Practice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List li = new ArrayList();

        li.add(2);
        li.add(67);
        li.add(33);
        li.add(78);
        li.add(56);
        li.add(1);
        li.add(99);
        //Collections is a class that provides number of functions for list
        Collections.sort(li);
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);



    }
}
