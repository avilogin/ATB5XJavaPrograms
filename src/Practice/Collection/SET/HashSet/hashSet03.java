package src.Practice.Collection.SET.HashSet;

import java.util.*;

public class hashSet03 {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("Avijeet");
        s.add(1);
        s.add(true);
        s.add(22.34);
        s.add(null);

        Iterator it = s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
