package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArray {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(20);
        arr.add(99);
        arr.add(0);
        arr.add(56);
        arr.add(02);
        arr.add(5);
        arr.add(1);

        Iterator it = arr.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("--------After Sorting-----");
        Collections.sort(arr);

        Iterator i = arr.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }




    }

}
