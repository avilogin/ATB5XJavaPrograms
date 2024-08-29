package src.Practice.Collection.SET.HashSet;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AddAllElements {
    public static void main(String[] args) {
        System.out.println("-------First Set-----");
        HashSet<Integer> l = new HashSet<>();
        l.add(1);
        l.add(3);
        l.add(2);
        l.add(5);
        l.add(4);
        for (Integer i : l)
        {
            System.out.print(i+"\t");
        }
        System.out.println();

        System.out.println("-------Second Set-----");
        TreeSet<Integer> h = new TreeSet<>();
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);
        System.out.println(h);
        System.out.println("-------Final Set-----");
        l.addAll(h);
        System.out.println(l);
        //Collections.reverse;
    }
}
