package src.Practice.Collection.SET.HashSet;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetIntoTreeSet {
    public static void main(String[] args) {
        HashSet h =  new HashSet();
        h.add("First");
        h.add("Second");
        h.add("Third");
        h.add("Forth");
        System.out.println("HashSet - > "+h);

        TreeSet t =  new TreeSet(h);
        System.out.println("TreeSet - > "+t);



    }
}
