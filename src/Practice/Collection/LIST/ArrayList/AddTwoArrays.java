package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoArrays {
    public static void main(String[] args) {
        System.out.println("-------First Array-----");
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);

        System.out.println("-------Second Array-----");
        List<Integer> i = new ArrayList();
        i.add(6);
        i.add(7);
        i.add(8);
        i.add(9);
        i.add(10);
        System.out.println(i);
        System.out.println("-------Third Array-----");
        List c = new ArrayList();
        c.addAll(l);
        c.addAll(i);
        System.out.println(c);





    }
}
