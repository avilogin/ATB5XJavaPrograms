package src.Practice.Collection.SET.HashSet;

import java.util.HashSet;

public class HashSetIntoArray {
    public static void main(String[] args) {
        HashSet h =  new HashSet();
        h.add("First");
        h.add("Second");
        h.add("Third");
        h.add("Forth");
        System.out.println(h);

        String arr[] = new String[h.size()];
        h.toArray(arr);
        for (String s :arr)
        {
            System.out.println(s);
        }


    }
}
