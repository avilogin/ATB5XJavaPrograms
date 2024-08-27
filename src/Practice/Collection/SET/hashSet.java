package src.Practice.Collection.SET;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Avijeet");
        s.add("jana");
        s.add("is");
        s.add("Avijeet");//can't have duplicate values
        s.add(null);

        Iterator it = s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
