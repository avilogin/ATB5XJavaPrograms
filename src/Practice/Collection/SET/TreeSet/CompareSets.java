package src.Practice.Collection.SET.TreeSet;

import java.util.TreeSet;

public class CompareSets {
    public static void main(String[] args) {
        TreeSet<String> l = new TreeSet();
        l.add("dana");
        l.add("Cana");
        l.add("Zana");
        l.add("Fana");
        l.add("Yana");

        System.out.println(l);

        TreeSet<String> t = new TreeSet();
        t.add("Bana");
        t.add("Cana");
        t.add("Zana");
        t.add("Fana");
        t.add("pana");
        System.out.println(t);

        for (String c :l)
        {
            if((t.contains(c)))
            {
                System.out.println(c +" -- Match");
            }
            else
            {
                System.out.println(c +" -- No Match");
            }

        }


    }
}
