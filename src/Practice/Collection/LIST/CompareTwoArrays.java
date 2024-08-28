package src.Practice.Collection.LIST;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrays {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);

        List<Integer> i = new ArrayList();
        i.add(1);
        i.add(2);
        i.add(0);
        i.add(9);
        i.add(5);
        System.out.println(i);

        List j = new ArrayList();
        for (Integer c : l)
        {
            j.add(i.contains(c)? "Match":"Not Match");
        }
        System.out.println(j);



    }
}
